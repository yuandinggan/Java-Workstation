package cn.reaper.controller;


import cn.reaper.pojo.Role;
import cn.reaper.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    private RoleServiceImpl roleServiceImpl;

//    public void setRoleServiceImpl(RoleServiceImpl roleServiceImpl) {
//        this.roleServiceImpl = roleServiceImpl;
//    }

    @RequestMapping("/user")
    public ModelAndView User(){
        ModelAndView modelAndView=new ModelAndView();
        List<Role> roleList=roleServiceImpl.list();
        System.out.println(roleList);
        //设置模型
        modelAndView.addObject("roleList",roleList);
        //设置试图
        modelAndView.setViewName("user-list");
        return modelAndView;
    }


    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        List<Role> roleList=roleServiceImpl.list();
        System.out.println(roleList);
        //设置模型
        modelAndView.addObject("roleList",roleList);
        //设置试图
        modelAndView.setViewName("role-list");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Role role){
        roleServiceImpl.save(role);
        return "redirect:/role/list";
    }
}
