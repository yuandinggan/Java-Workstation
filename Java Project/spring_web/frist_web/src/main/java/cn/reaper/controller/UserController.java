package cn.reaper.controller;

import cn.reaper.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 页面跳转方式
     */

    @RequestMapping("/saveOfModelAndView")
    public ModelAndView saveOfModelAndView(){
        System.out.println("saveOfModelAndView");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","Reaper");
        modelAndView.setViewName("save");
        return modelAndView;
    }

    @RequestMapping("/saveOfString")
    public String saveOfString(){
        System.out.println("saveOfString");
        return "save";
    }

    @RequestMapping("/saveOfModel")
    public String saveOfModel(Model model){
        System.out.println("model");
        model.addAttribute("username","Model");
        return "save";
    }

    @RequestMapping("/saveArgs")
    public ModelAndView saveOfModel(ModelAndView modelAndView){
        System.out.println("model");
        modelAndView.addObject("username","ModelAndView");
        modelAndView.setViewName("save");
        return modelAndView;
    }

    @RequestMapping("/saveOfHttpServletRequest")
    public String saveOfHttpServletRequest(HttpServletRequest request){
        request.setAttribute("username","saveOfHttpServletRequest");
        return "save";
    }

    /**
     * 回写数据方式
     */
    @RequestMapping("/quick")
    public void quick(HttpServletResponse response){
        try {
            response.getWriter().print("Hello response getWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/quick1")
    @ResponseBody
    public String quick1(){
        return "Hello Reaper!";
    }

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() throws IOException{
        User user=new User();
        user.setId(1);
        user.setName("Reaper");
        user.setAge(24);
        //使用Json转化工具
        ObjectMapper objectMapper=new ObjectMapper();

        return objectMapper.writeValueAsString(user);
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public User quick3() throws IOException{
        User user=new User();
        user.setId(1);
        user.setName("Reaper");
        user.setAge(24);
        return user;
    }

    @RequestMapping("/quick4")
    @ResponseBody
    public String quick4(String username,int age){
        return "我叫"+username+",今年"+age+"岁了！";
    }

    @RequestMapping("/quick5")
    @ResponseBody
    public User quick5(User user){
        return user;
    }

    @RequestMapping("/quick6")
    @ResponseBody
    public void quick6(String[] arrs){
        System.out.println(Arrays.asList(arrs));
    }

    @RequestMapping("/ajax")
    public String ajax(){
        return "ajax";
    }

    @RequestMapping ("/quick7")
    @ResponseBody
    public List<User> quick7(@RequestBody List<User> list){
        System.out.println(list);
        return list;
    }

    //参数绑定
    @RequestMapping ("/quick8")
    @ResponseBody
    public void quick8(@RequestParam(value = "name") String username) throws Exception{
        System.out.println(username);
    }

    //获取Restful风格参数  PathVariable
    @RequestMapping ("/quick9/{name}")
    @ResponseBody
    public void quick9(@PathVariable(value = "name",required = true) String username) throws Exception{
        System.out.println(username);
    }

    //自定义类型转换器
    @RequestMapping ("/quick10")
    public void quick10(Date date) throws Exception{
        System.out.println(date);
    }

    //获取Servlet Api
    @RequestMapping ("/quick11")
    public void quick10(HttpServletRequest request,HttpServletResponse response) throws Exception{
        System.out.println(request);
        System.out.println(response);
    }

    //获取请求头 RequestHeader
    @RequestMapping ("/quick12")
    @ResponseBody
    public void quick12(@RequestHeader(value = "User-Agent") String user_agent) throws Exception{
        System.out.println(user_agent);
    }

    //文件上传
    @RequestMapping ("/quick13")
    @ResponseBody
    public void quick13(String username, MultipartFile[] uploadFile) throws Exception{
        System.out.println(username);
        for (MultipartFile multipartFile : uploadFile) {
            String fileName = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("F:\\资料\\"+fileName));
        }

    }

}
