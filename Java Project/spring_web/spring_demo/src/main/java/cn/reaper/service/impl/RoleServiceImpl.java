package cn.reaper.service.impl;

import cn.reaper.dao.impl.RoleDaoImpl;
import cn.reaper.pojo.Role;
import cn.reaper.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDaoImpl roleDaoImpl;

    public void setRoleDaoImpl(RoleDaoImpl roleDaoImpl) {
        this.roleDaoImpl = roleDaoImpl;
    }

    @Override
    public List<Role> list() {
       List<Role> roleList =  roleDaoImpl.findAll();
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleDaoImpl.save(role);
    }
}
