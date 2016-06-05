package org.xman.jeefw.config.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.ViewResolver;

@Configuration
@Profile("java")
public class ClasspathBeetlConfig {

    @Bean(initMethod = "init", name = "beetlConfig")
    public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {

        BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
        ClasspathResourceLoader classpathResourceLoader = new ClasspathResourceLoader();
        beetlGroupUtilConfiguration.setResourceLoader(classpathResourceLoader);

        //读取配置文件信息
//        beetlGroupUtilConfiguration.setConfigFileResource(patternResolver.getResource("classpath:beetl.properties"));
        return beetlGroupUtilConfiguration;
    }

    @Bean(name = "viewResolver")
    @Autowired
    public ViewResolver viewResolver(BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
        BeetlSpringViewResolver viewResolver = new BeetlSpringViewResolver();
        viewResolver.setOrder(0);
        viewResolver.setPrefix("/templates");
        viewResolver.setSuffix(".html");
        viewResolver.setContentType("text/html;charset=UTF-8");

//        viewResolver.setConfig(beetlGroupUtilConfiguration);

        return viewResolver;
    }
}
