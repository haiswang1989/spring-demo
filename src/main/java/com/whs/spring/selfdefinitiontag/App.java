package com.whs.spring.selfdefinitiontag;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * <p>Description:</p>
 * @author hansen.wang
 * @date 2018年4月4日 上午9:06:30
 */
public class App {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        
        try {
            System.in.read();
        } catch (IOException e) {
        }
        
        context.close();
    }

}
