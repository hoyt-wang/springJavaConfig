package com.kaishengit.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

/**
 * Created by hoyt on 2017/10/30.
 */

//@Repository
//@Scope("prototype")
//@Lazy
@Named
public class UserDao {

    public void save() {
        System.out.println("userDao saved");
    }
}
