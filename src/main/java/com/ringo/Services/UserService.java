package com.ringo.Services;

import com.ringo.dao.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class UserService {
    @Resource
    private User user;
    @Transactional(propagation = Propagation.REQUIRED)
    public  int totranfer(int outid, int inid, BigDecimal money){
        int code=0;
        int outrow=user.expense(outid,money);
        int i=1/0;
        int inrow=user.income(inid,money);
        if(outrow==1&&inrow==1){
            code=1;
            return code;
        }
        return code;
    }
}
