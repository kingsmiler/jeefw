package org.xman.jeefw.config.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.ViewResolver;

@Configuration
@Profile("web")
public class WebInfoBeetlConfig {

    @Bean(name = "beetlConfig", initMethod = "init")
    public BeetlGroupUtilConfiguration beetlConfig() {

        return new BeetlGroupUtilConfiguration();
    }

    @Bean(name = "viewResolver")
    public ViewResolver viewResolver() {
        BeetlSpringViewResolver viewResolver = new BeetlSpringViewResolver();
        viewResolver.setPrefix("/WEB-INF/templates");
        viewResolver.setSuffix(".html");
        viewResolver.setContentType("text/html;charset=UTF-8");
        viewResolver.setOrder(0);

        return viewResolver;
    }

}
