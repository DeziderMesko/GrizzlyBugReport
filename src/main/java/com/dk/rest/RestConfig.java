package com.dk.rest;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.dk.ConfigProvider;
import com.dk.MongoConnector;

public class RestConfig extends ResourceConfig {
    public RestConfig(){
        packages("com.dk.data");
        register(RestFunctions.class);
        register(MultiPartFeature.class);
        register(AccessControlAllowFilter.class);
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(MongoConnector.class).to(MongoConnector.class);
                bind(ConfigProvider.class).to(ConfigProvider.class);
            }
        });
        // register(LoggingFilter.class);
        // Map<String, Object> properties = new HashMap<String, Object>();
        // properties.put("jersey.config.server.tracing.type", "ALL");
        // properties.put("jersey.config.server.tracing.threshold", "VERBOSE");
        // this.addProperties(properties);
    }
}