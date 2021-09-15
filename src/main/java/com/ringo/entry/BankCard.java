package com.ringo.entry;

import java.math.BigDecimal;

public class BankCard {
    private int id;
    private String bank_name;
    private String bank_no;
    private String card_no;
    private BigDecimal money;
    private int userid;

    public BankCard(int id, String bank_name, String bank_no, String card_no, BigDecimal money, int userid) {
        this.id = id;
        this.bank_name = bank_name;
        this.bank_no = bank_no;
        this.card_no = card_no;
        this.money = money;
        this.userid = userid;
    }

    public  BankCard(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_no() {
        return bank_no;
    }

    public void setBank_no(String bank_no) {
        this.bank_no = bank_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    //拆分表，通过主键字段，比如user表，可以生成一个userid（10位随机字符）来拆分 hash%)，或者(unique键)
}

