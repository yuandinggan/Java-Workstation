package cn.reaper.factory;

import cn.reaper.dao.UserDao;
import cn.reaper.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

}
