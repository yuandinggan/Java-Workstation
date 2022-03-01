package cn.reaper.service.impl;

import cn.reaper.dao.UserDao;
import cn.reaper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//   <bean id="userService" class="cn.reaper.service.impl.UserServiceImpl">
//        <property name="userDao" ref="userDao"/>
//    </bean>
@Component("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;
    //    <property name="userDao" ref="userDao"/>
//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
        System.out.println("userService save");
        System.out.println("driver" + driver);
    }
}
