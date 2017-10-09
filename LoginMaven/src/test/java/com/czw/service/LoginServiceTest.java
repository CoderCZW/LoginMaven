package com.czw.service;

import com.czw.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

@ContextConfiguration("classpath*:/applicationContext.xml")
public class LoginServiceTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;

    @Test
    public void testLogin(){
        User user = loginService.login("jack","123");
        assertEquals(user.getLoginname(),"jack");
        assertEquals(user.getPassword(),"123");
    }

    @Test
    public void testSelectAll(){
        List<User> list = loginService.selectAll();
        for(User user:list){
            System.out.println(user.getLoginname()+" "+user.getPassword());
        }
    }

    @Test
    public void testSave(){
        loginService.saveUser("czw","123");
    }

    @Test
    public void testAdd(){
        User user = new User();
        user.setLoginname("czw");
        user.setPassword("123");
        loginService.addUser(user);
    }

    @Test
    public void testDelete(){
        String name = "jack";
        loginService.deleteUser(name);
    }

}
