package cn.reaper.service;

import cn.reaper.pojo.Role;

import java.util.List;

public interface RoleService {
    public List<Role> list();

    public void save(Role role);
}
