package com.yikolemon.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 消息转换器，引用了这个包，会通用配置
 *
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        //将java对象转化为json对象
        converters.add(new MappingJackson2HttpMessageConverter());
        WebMvcConfigurer.super.configureMessageConverters(converters);
    }

}
