package cn.reaper.test;

import cn.reaper.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");

        System.out.println("userDoa2地址：" + userDao);
        ((ClassPathXmlApplicationContext) app).close();
    }
}
