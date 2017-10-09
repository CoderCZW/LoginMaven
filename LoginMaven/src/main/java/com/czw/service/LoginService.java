package com.czw.service;

import com.czw.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginService {

    User login(String loginname, String password);

    User selectByLoginname(String loginname);

    List<User> selectAll();

    void addUser(User user);

    void deleteUser(String loginname);

    void saveUser(String loginname, String password);

}
