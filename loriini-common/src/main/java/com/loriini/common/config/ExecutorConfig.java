package com.loriini.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
@Lazy
public class ExecutorConfig {

    @Bean
    public ExecutorService fixedCachedThreadPoolExecutor(@Value("${loriini.executor.maximumPoolSize:25}") int maximumPoolSize) {
        int corePoolSize = 10;
        return new ThreadPoolExecutor(corePoolSize, maximumPoolSize < corePoolSize ? corePoolSize : maximumPoolSize, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    }
}
