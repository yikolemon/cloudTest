package com.yikolemon.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PreRequestFilter extends ZuulFilter {
    @Override
    //定义filter的类型
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    //定义filter的执行顺序
    public int filterOrder() {
        return 0;
    }

    @Override
    //是否需要执行这个过滤器
    public boolean shouldFilter() {
        return true;
    }

    @Override
    //过滤操作
    public Object run() throws ZuulException {
        RequestContext context=RequestContext.getCurrentContext();
        context.set("startTime",System.currentTimeMillis());
        return null;
    }
}
