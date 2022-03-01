package cn.reaper.web;

import cn.reaper.config.SpringCofiguration;
import cn.reaper.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserController {
    public static void main(String[] args) {

//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
////        UserService userService = app.getBean(UserService.class);
////
////        userService.save();

        //注解
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();


    }
}
