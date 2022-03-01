package cn.reaper.dao;

import cn.reaper.pojo.Role;

import java.util.List;

public interface RoleDao {
     List<Role> findAll();
     void save(Role role);
}
