package com.dk

import org.jongo.marshall.jackson.JacksonMapper
import org.jvnet.hk2.annotations.Service

import com.fasterxml.jackson.databind.SerializationFeature

@Service
class JSONMarshaller {

    def static JacksonMapper m = new JacksonMapper.Builder().enable(SerializationFeature.INDENT_OUTPUT).build();

    def synchronized pojoTojson(Object pojo){
        return m.getMarshaller().marshall(pojo).toString()
    }
}
