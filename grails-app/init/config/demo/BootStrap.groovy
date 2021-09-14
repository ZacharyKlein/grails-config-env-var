package config.demo

import org.springframework.beans.factory.annotation.Value

class BootStrap {

    @Value('${vault.token:default value}')
    String token

    def init = { servletContext ->

        println "token: $token"
    }
    def destroy = {
    }
}
