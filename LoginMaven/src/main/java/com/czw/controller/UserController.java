package com.czw.controller;

import com.czw.domain.User;
import com.czw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam("loginname")String loginname,
                              @RequestParam("password")String password){
        ModelAndView mv = new ModelAndView();
        User user = loginService.login(loginname,password);
        if(user != null){
            mv.addObject("user",user);
            mv.setViewName("/main");
        }else{
            mv.addObject("message","用户名或密码错误！");
            mv.setViewName("/loginForm");
        }
        return mv;
    }

//    @RequestMapping(value = "/main")
//    public String Login2(){
//        return "/main";
//    }

    @RequestMapping(value = "/select")
    public ModelAndView selectAll(){
        ModelAndView mv = new ModelAndView();
        List<User> list = loginService.selectAll();
        mv.addObject("list",list);
        mv.setViewName("/showUser");
        return mv;
    }

    @RequestMapping(value = "/add")
    public String add(){
        return "/showAddUser";
    }

    @RequestMapping(value = "/addUser")
    public ModelAndView addUser(@ModelAttribute User user){
        ModelAndView mv = new ModelAndView();
        loginService.addUser(user);
        mv.setViewName("/loginForm");
        return mv;
    }

    @RequestMapping(value = "/delete")
    public String delete(){
        return "/showDeleteUser";
    }

    @RequestMapping(value = "/deleteUser")
    public String deleteUser(@RequestParam("loginname") String loginname){
        User user = loginService.selectByLoginname(loginname);
        if(user == null){
            return "/showDeleteUser";
        }else{
            loginService.deleteUser(loginname);
            return "/loginForm";
        }
    }

}
