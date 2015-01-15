package com.dk.rest

import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import groovyx.net.http.HTTPBuilder

import java.text.SimpleDateFormat

import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.CookieParam
import javax.ws.rs.DELETE
import javax.ws.rs.FormParam
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Cookie
import javax.ws.rs.core.NewCookie
import javax.ws.rs.core.Response

import org.glassfish.jersey.media.multipart.FormDataContentDisposition
import org.glassfish.jersey.media.multipart.FormDataParam

import com.dk.ConfigProvider
import com.dk.MongoConnector
import com.dk.data.ExerciseLogEntry
import com.dk.data.ExerciseType

@Path("ccfiles")
class RestFunctions {

    @Inject
    MongoConnector mongoConnector

    ConfigObject config

    @Inject
    def public RestFunctions(){
        config = ConfigProvider.getConfig()
    }


    @GET @Path("/staticData")
    @Produces("application/json")
    def getStaticData(){
        def mapValues = [:]
        ExerciseType.values().each{
            mapValues[it.name()]=it
        }
        return Response.ok(mapValues).build()
    }

}
