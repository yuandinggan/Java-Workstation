package cn.reaper.factory;

import cn.reaper.dao.UserDao;
import cn.reaper.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
