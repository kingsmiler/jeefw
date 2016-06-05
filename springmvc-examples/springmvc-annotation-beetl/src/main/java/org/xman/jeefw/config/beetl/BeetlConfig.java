package org.xman.jeefw.config.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class BeetlConfig {

    @Bean(name = "beetlConfig", initMethod = "init")
    public BeetlGroupUtilConfiguration beetlConfig() {
        BeetlGroupUtilConfiguration configuration = new BeetlGroupUtilConfiguration();
        configuration.setRoot("/");

        return configuration;
    }

    @Bean(name = "viewResolver")
    public ViewResolver viewResolver() {
        BeetlSpringViewResolver viewResolver = new BeetlSpringViewResolver();
        viewResolver.setContentType("text/html;charset=UTF-8");

        return viewResolver;
    }
}
