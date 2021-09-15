package com.ringo.dao;

import com.ringo.entry.BankCard;

public interface Bank {
    public int addCard(BankCard bankCard);
    public int deleteCard(int user_id,int bank_id,int card_no);
}
