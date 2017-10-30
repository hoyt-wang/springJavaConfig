package com.kaishengit;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;
import com.kaishengit.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by hoyt on 2017/10/30.
 */

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Application {

    //手动添加节点
    /*@Bean
    public UserDao userDao() {
        return new UserDao();
    }
*/
   /* @Bean
    public UserService userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }*/
}
