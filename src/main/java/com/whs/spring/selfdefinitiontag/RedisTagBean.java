package com.whs.spring.selfdefinitiontag;

/**
 * 自定义标签
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月3日 下午6:05:57
 */
public class RedisTagBean {
    
    private String id;
    
    private String key;
    
    private String value;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
