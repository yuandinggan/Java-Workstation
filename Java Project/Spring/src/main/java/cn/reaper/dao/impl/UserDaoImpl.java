package cn.reaper.dao.impl;

import cn.reaper.dao.UserDao;
import cn.reaper.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    //    private String username;
//    private int sex;
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setSex(Integer sex) {
//        this.sex = sex;
//    }
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;


    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        System.out.println(strList + "***" + userMap + "---" + properties);
//        System.out.println(username+"******"+sex);
        System.out.println("实现save-User");
    }


//    public UserDaoImpl(){
//        System.out.println("UserDao无参构造");
//    }
//
//    public void init(){
//        System.out.println("初始化方法");
//    }
//
//    public void destory(){
//        System.out.println("销毁方法");
//    }
}
