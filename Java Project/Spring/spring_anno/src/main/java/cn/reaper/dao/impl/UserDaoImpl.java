package cn.reaper.dao.impl;

import cn.reaper.dao.UserDao;
import org.springframework.stereotype.Component;

//<bean id="userDao" class="cn.reaper.dao.impl.UserDaoImpl"/>
@Component("userDao")
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("save running");
    }
}