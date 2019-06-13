package com.loriini.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Objects;
import java.util.stream.Stream;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1; // run before PreDecoration;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return !ctx.containsKey(FORWARD_TO_KEY) // a filter has already forwarded
                && !ctx.containsKey(SERVICE_ID_KEY); // a filter has already determined serviceId
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("ZuulLoggingFilter ==> request: {} requestUri: {}, requestUrl: {} ", request, request.getRequestURI(), request.getRequestURL());
        logCookies(request);
        logHeaders(request);

        /*
            if (request.getParameter("sample") != null) {
            // put the serviceId in `RequestContext`
            ctx.put(FilterConstants.SERVICE_ID_KEY, request.getParameter("foo"));
            }
        */
        return null;
    }

    private void logCookies(HttpServletRequest request) {

        if (Objects.isNull(request.getCookies())) {
            return;
        }

        Stream.of(request.getCookies()).forEach(cookie ->
                logger.info("cookie ==> {}, cookieName: {}, cookieValue: {}, cookieDomain: {},", cookie, cookie.getName(), cookie.getValue(), cookie.getDomain())
        );
    }

    private void logHeaders(HttpServletRequest request) {

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            logger.info("header: {}, value: {}", headerName, request.getHeader(headerName));
        }

    }
}
