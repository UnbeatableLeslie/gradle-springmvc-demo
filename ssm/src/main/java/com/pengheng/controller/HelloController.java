package com.pengheng.controller;

import com.pengheng.pojo.Account;
import com.pengheng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Author pengheng
 * @Date 2020/12/5 0:46
 * @Remark
 */
@Controller
public class HelloController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/hello")
    @ResponseBody
    public List<Account> hello(Model model){
        return accountService.queryAccountList();
    }
}
