/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.drive;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleDriveEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "accessToken": ((GoogleDriveEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationName": ((GoogleDriveEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientFactory": ((GoogleDriveEndpoint) target).setClientFactory(property(camelContext, org.apache.camel.component.google.drive.GoogleDriveClientFactory.class, value)); return true;
        case "clientId": ((GoogleDriveEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientSecret": ((GoogleDriveEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "inBody": ((GoogleDriveEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshToken": ((GoogleDriveEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleDriveEndpoint) target).getConfiguration().setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleDriveEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((GoogleDriveEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((GoogleDriveEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GoogleDriveEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((GoogleDriveEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((GoogleDriveEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((GoogleDriveEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleDriveEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((GoogleDriveEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((GoogleDriveEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((GoogleDriveEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleDriveEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleDriveEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((GoogleDriveEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((GoogleDriveEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((GoogleDriveEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((GoogleDriveEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleDriveEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((GoogleDriveEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((GoogleDriveEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((GoogleDriveEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((GoogleDriveEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((GoogleDriveEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname": ((GoogleDriveEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientfactory": ((GoogleDriveEndpoint) target).setClientFactory(property(camelContext, org.apache.camel.component.google.drive.GoogleDriveClientFactory.class, value)); return true;
        case "clientid": ((GoogleDriveEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret": ((GoogleDriveEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "inbody": ((GoogleDriveEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken": ((GoogleDriveEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleDriveEndpoint) target).getConfiguration().setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleDriveEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((GoogleDriveEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((GoogleDriveEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GoogleDriveEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((GoogleDriveEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((GoogleDriveEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((GoogleDriveEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleDriveEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((GoogleDriveEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((GoogleDriveEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((GoogleDriveEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleDriveEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleDriveEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((GoogleDriveEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((GoogleDriveEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((GoogleDriveEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((GoogleDriveEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleDriveEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((GoogleDriveEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((GoogleDriveEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((GoogleDriveEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((GoogleDriveEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
