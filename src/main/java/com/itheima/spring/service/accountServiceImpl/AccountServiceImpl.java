package com.itheima.spring.service.accountServiceImpl;

import com.itheima.spring.dao.AccountDao;
import com.itheima.spring.domain.Account;
import com.itheima.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account FindAccountById(Integer AccountId) {
        return accountDao.FindAccountById(AccountId);
    }

    public void Add(Account account) {
        accountDao.Add(account);
    }

    public void deleteAccount(Integer AccountId) {
        accountDao.deleteAccount(AccountId);
    }

    public void update(Account account) {
        accountDao.update(account);
    }
}
