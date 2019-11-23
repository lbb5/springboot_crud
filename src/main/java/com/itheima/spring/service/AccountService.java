package com.itheima.spring.service;

import com.itheima.spring.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();
    //查询一行
    Account FindAccountById(Integer AccountId);
    //增加一行
    void Add(Account account);

    //删除一行
    void deleteAccount(Integer AccountId);

    //修改一行的数据

    void update(Account account);
}
