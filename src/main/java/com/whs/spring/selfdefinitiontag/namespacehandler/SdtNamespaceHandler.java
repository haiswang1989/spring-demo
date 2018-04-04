package com.whs.spring.selfdefinitiontag.namespacehandler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.whs.spring.selfdefinitiontag.beandefinitionparser.RedisTagBeanDefinitionParser;

/**
 * 自定义命名空间解析类
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月3日 下午6:00:09
 */
public class SdtNamespaceHandler extends NamespaceHandlerSupport {
    
    @Override
    public void init() {
        registerBeanDefinitionParser("redisBean", new RedisTagBeanDefinitionParser());
    }
}
