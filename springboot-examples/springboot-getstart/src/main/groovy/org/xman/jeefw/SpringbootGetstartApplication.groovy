package org.xman.jeefw

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration

@CompileStatic
@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
class SpringbootGetstartApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringbootGetstartApplication, args)
    }
}
