package com.yikolemon;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulGateWay {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWay.class,args);
    }
}
