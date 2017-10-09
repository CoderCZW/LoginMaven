package com.czw.service;

import com.czw.dao.UserDao;
import com.czw.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT)
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public User login(String loginname, String password) {
        return userDao.selectByLoginnameAndPassword(loginname,password);
    }

    public User selectByLoginname(String loginname) {
        return userDao.selectByLoginname(loginname);
    }

    public List<User> selectAll() {
        return userDao.selectAllUser();
    }

    public void addUser(User user) {
        userDao.insert(user);
    }

    public void deleteUser(String loginname) {
        userDao.deleteUserByName(loginname);
    }

    public void saveUser(String loginname, String password) {
        userDao.save(loginname,password);
    }
}
