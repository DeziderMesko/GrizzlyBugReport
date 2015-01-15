package com.dk


class ConfigProvider {
    static ConfigObject getConfig(){
        def env = System.getenv("CC_ENV")
        def cs
        if(env == null){
            cs = new ConfigSlurper()
        } else {
            cs = new ConfigSlurper(env)
        }

        return cs.parse(new File('config.groovy').toURI().toURL())
    }
}
