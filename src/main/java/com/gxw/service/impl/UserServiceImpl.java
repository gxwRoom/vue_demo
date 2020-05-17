package com.gxw.service.impl;

import com.gxw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gxw.enity.User;
import com.gxw.service.UserService;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询用户列表
     * @return
     */
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    /**
     * 根据uid查询
     * @param uid
     * @return
     */
    @Override
    public User findById(Integer uid) {
        return userDao.findById(uid);
    }

    /**
     * 更新用户
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
