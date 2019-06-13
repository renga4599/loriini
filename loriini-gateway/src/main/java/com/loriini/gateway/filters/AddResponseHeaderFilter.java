package com.loriini.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SEND_RESPONSE_FILTER_ORDER;

@Component
public class AddResponseHeaderFilter extends ZuulFilter {
    public String filterType() {
        return POST_TYPE;
    }

    public int filterOrder() {
        return SEND_RESPONSE_FILTER_ORDER - 1;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletResponse servletResponse = context.getResponse();
        servletResponse.addHeader("X-Foo",
                UUID.randomUUID().toString());
        return null;
    }
}