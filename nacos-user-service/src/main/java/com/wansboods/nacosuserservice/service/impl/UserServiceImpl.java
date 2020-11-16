package com.wansboods.nacosuserservice.service.impl;

import com.wansboods.common.domain.User;
import com.wansboods.nacosuserservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sean.wan
 * @email 164170237@qq.com
 * @description
 * @Date 2020/11/16 14:46
 */
@Service
public class UserServiceImpl implements UserService {
    private List<User> userList;

    @Override
    public void create(User user) {

    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        return null;
    }
}
