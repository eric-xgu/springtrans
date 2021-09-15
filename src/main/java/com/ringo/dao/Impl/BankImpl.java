package com.ringo.dao.Impl;

import com.ringo.dao.Bank;
import com.ringo.entry.BankCard;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BankImpl implements Bank {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public int addCard(BankCard bankCard) {
        String sql="insert into bankcard(id,bank_name,bank_no,card_no,money,user_id) values(default,?,?,?,?,?)";
        Object []objects={bankCard.getBank_name(),bankCard.getBank_no(),bankCard.getCard_no(),bankCard.getMoney(),bankCard.getUserid()};
        int row=jdbcTemplate.update(sql,objects);
        return row;
    }

    @Override
    public int deleteCard(int user_id,int bank_id,int card_no) {
        String sql="delete  from bankcard where user_id=? and bank_no=? and card_no=?";
        Object []objects={user_id,bank_id,card_no};
        int row=jdbcTemplate.update(sql,objects);
        return row;
    }
}
