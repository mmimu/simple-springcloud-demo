package com.mimu.springcloud.consul.service.consumer.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import feign.Feign;
import feign.Retryer;
import feign.querymap.BeanQueryMapEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectApplicationConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }

    /**
     * 改 builder 主要指定 feign 的 参数 解析
     * 使用 @SpringQueryMap 中 的对象参数 可以解析通过继承的 父类中的 参数字段
     *
     * @return
     */
    @Bean
    public Feign.Builder feignBuilder() {
        return Feign.builder().queryMapEncoder(new BeanQueryMapEncoder()).retryer(Retryer.NEVER_RETRY);
    }
}
