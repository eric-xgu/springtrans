package com.ringo;

import static org.junit.Assert.assertTrue;

import com.ringo.Services.UserService;
import com.ringo.dao.Bank;
import com.ringo.dao.User;
import com.ringo.entry.BankCard;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base
{
    @Resource
    private Bank bank;
    @Resource
    private UserService userService;
    @Test
    public void test(){
//        BigDecimal bigDecimal=new BigDecimal("1000000.0");
//        BigDecimal bigDecimal2=new BigDecimal("997999.1");
//        BankCard bankcard=new BankCard(1,"中国建设","0001","98472101",bigDecimal,1);
//        BankCard bankcard2=new BankCard(2,"中国工商","0002","98401211",bigDecimal2,2);
//        bank.addCard(bankcard);
//        bank.addCard(bankcard2);
        BigDecimal big=new BigDecimal(100);
        userService.totranfer(1,2,big);

    }
}
