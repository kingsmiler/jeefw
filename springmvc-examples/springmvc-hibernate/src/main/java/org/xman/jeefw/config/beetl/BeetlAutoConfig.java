package org.xman.jeefw.config.beetl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类型的自动转换,需要借助于 PropertySourcesPlaceholderConfigurer 和 ConversionService。
 */
@Component
public class BeetlAutoConfig {
    @Value("${spring.beetl.prefix}")
    private String prefix;

    @Value("${spring.beetl.suffix}")
    private String suffix;

    @Value("${spring.beetl.config}")
    private String config;

    @Value("${spring.beetl.content-type}")
    private String contentType;

    @Value("${spring.beetl.order}")
    private int order;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
