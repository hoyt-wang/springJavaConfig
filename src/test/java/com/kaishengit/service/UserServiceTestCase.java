package com.kaishengit.service;

import com.kaishengit.Application;
import com.kaishengit.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hoyt on 2017/10/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class UserServiceTestCase {

    @Autowired
    private UserService userService;
    @Test
    public void save() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        UserService userService = (UserService) context.getBean("userServiceImpl");
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.save();

    }
}
