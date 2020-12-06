package com.pengheng.service.impl;

import com.pengheng.mapper.AccountMapper;
import com.pengheng.pojo.Account;
import com.pengheng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pengheng
 * @Date 2020/12/6 1:48
 * @Remark
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> queryAccountList() {
        return accountMapper.queryAccountList();
    }
}
