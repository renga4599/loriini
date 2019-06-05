package com.loriini.notification.client;

/**
 * Ribbon, by default, uses the rule RoundRobinRule. This rule will sequentially choose
 * each of the instances Eureka shows that you have raised, independent of the time it costs each instance to respond.
 * <p>
 * If you wish to use any of the other three available rules,
 * or even define a new rule, then we have to create a class of configuration for Ribbon.
 * <p>
 * In the function ribbonRule(), we return the object WeightedResponseTimeRule, if we want
 * the balancing logic to take into account the response time of each instance.
 */

public class RibbonConfiguration {

/*    @Bean
    public IPing ribbonPing() {
        return new NoOpPing();
    }

    @Bean
    public IRule ribbonRule() {
        return new WeightedResponseTimeRule();
    }*/
}
