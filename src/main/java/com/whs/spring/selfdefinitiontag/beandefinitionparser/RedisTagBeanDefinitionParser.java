package com.whs.spring.selfdefinitiontag.beandefinitionparser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

import com.whs.spring.selfdefinitiontag.RedisTagBean;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月3日 下午6:02:54
 */
public class RedisTagBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    
    @Override
    protected Class<?> getBeanClass(Element element) {
        return RedisTagBean.class;
    }
    
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        String key = element.getAttribute("key");
        String value = element.getAttribute("value");
        
        System.out.println("解析自定义标签, sdt配置, id : " + id + "key : " + key + " ,value : " + value);
        builder.addPropertyValue("id", id);
        builder.addPropertyValue("key", key);
        builder.addPropertyValue("value", value);
    }
}
