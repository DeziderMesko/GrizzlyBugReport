package com.dk

import org.jongo.Jongo
import org.jongo.MongoCollection
import org.jvnet.hk2.annotations.Service

import com.dk.data.Summary
import com.mongodb.DB
import com.mongodb.MongoClient

@Service
class MongoConnector {

    MongoCollection summaries

    def MongoConnector(){
        def config = ConfigProvider.getConfig()
        DB db = new MongoClient(config.mongo.server, config.mongo.port).getDB(config.mongo.db);
        Jongo jongo = new Jongo(db);
        summaries = jongo.getCollection(config.mongo.collection)
    }

    def Summary getSummary(String userId, boolean createNew){
        def summaryForUserId = summaries.findOne("{userId: #}", userId).as(Summary.class)
        if(summaryForUserId == null && createNew){
            summaryForUserId = new Summary()
            summaryForUserId.userId = userId
            summaries.insert(summaryForUserId)
        }
        return summaryForUserId
    }

    def Summary updateSummary(Summary s){
        summaries.update("{userId: #}", s.userId).with(s)
        return s
    }
}



