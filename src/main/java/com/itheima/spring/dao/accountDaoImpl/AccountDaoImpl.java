package com.itheima.spring.dao.accountDaoImpl;

import com.itheima.spring.dao.AccountDao;
import com.itheima.spring.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository("accountDaoImpl")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private  QueryRunner runner =null;

    public List<Account> findAll() {
        try {
            return  runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public Account FindAccountById(Integer AccountId) {
        try {
            return  runner.query("select * from account where id=?",new BeanHandler<Account>(Account.class),AccountId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public void Add(Account account) {
        try {
            runner.update("insert into account (name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(Integer AccountId) {
        try {
            runner.update("delete from account where id=?",AccountId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(Account account) {
        try {
            runner.update("update account set name=?,money=?",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
