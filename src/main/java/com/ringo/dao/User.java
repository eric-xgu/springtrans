package com.ringo.dao;

import java.math.BigDecimal;

public interface User {
    public int expense(int id, BigDecimal money);
    public  int income(int id,BigDecimal money);
}
