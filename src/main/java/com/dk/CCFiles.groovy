package com.dk

import javax.ws.rs.core.UriBuilder

import org.glassfish.grizzly.http.server.StaticHttpHandler
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory

import com.dk.rest.RestConfig


/*
 * Groovy script to start the example app
 */
println "Don't forget to setup CC_ENV and set/clear -DnoAuth"
def config =  ConfigProvider.getConfig()

baseUri = UriBuilder.fromUri(config.server.baseurl).port(config.server.port).build()
server = GrizzlyHttpServerFactory.createHttpServer(baseUri, new RestConfig(), false)
server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("./client"), "/")
server.getServerConfiguration().addHttpHandler(new StaticHttpHandler("./book"), "/blah1", "/blah2");
server.start()

System.out.println(String.format("Jersey app started with WADL available at " + "%sapplication.wadl\n"
        + "Hit enter to stop it...", baseUri, baseUri));

System.in.read()
server.shutdown()
