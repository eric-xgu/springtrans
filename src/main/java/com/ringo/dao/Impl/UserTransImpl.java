package com.ringo.dao.Impl;


import com.ringo.dao.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class UserTransImpl implements User {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public int expense(int id, BigDecimal money) {
        String sql="select money from bankcard where id=?";
        String up="update bankcard set money=? where id=?";
        BigDecimal temp;
        BigDecimal now_money=jdbcTemplate.queryForObject(sql,(ResultSet rs, int rowNum)->{
                return  rs.getBigDecimal(1);
        }
    ,id);
        if(now_money.compareTo(money)==1||now_money.compareTo(money)==0){
            temp=now_money.subtract(money);
            Object objects[]={temp,id};
            jdbcTemplate.update(up,objects);
        }else{
            System.out.println("余额不足");
        }

        return 0;
    }

    @Override
    public int income(int id, BigDecimal money) {
        String sql="select money from bankcard where id=?";
        String up="update bankcard set money=? where id=?";
        BigDecimal temp;
        BigDecimal now_money=jdbcTemplate.queryForObject(sql,(ResultSet rs, int rowNum)->{
                    return  rs.getBigDecimal(1);
                }
        ,id);
        temp=now_money.add(money);
        Object objects[]={temp,id};
        jdbcTemplate.update(up,objects);
        return 0;
    }
}
