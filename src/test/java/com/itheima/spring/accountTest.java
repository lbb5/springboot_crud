package com.itheima.spring;

import com.itheima.spring.SpringConfig.config;
import com.itheima.spring.domain.Account;
import com.itheima.spring.service.AccountService;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class accountTest {
    private  AccountService impl;
    private AnnotationConfigApplicationContext ac;
    @Before
    public void init(){
        ac=new AnnotationConfigApplicationContext(config.class);
        impl = ac.getBean("accountServiceImpl", AccountService.class);
    }

    @Test
    public void test1(){

        List<Account> all = impl.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
    @Test
    public void test2(){
        int i = Integer.parseInt("1");
        Account account = impl.FindAccountById(i);
        System.out.println(account);
    }
    @Test
    public void test3(){
        Account account = new Account();
        account.setId(5);
        account.setName("大大鸣");
        account.setMoney(5000.0f);
        impl.Add(account);
        test1();
    }


}
