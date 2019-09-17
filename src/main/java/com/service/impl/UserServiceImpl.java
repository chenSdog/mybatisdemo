package com.service.impl;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/17 20:46
 * @modified By：
 * @version: 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }
}
