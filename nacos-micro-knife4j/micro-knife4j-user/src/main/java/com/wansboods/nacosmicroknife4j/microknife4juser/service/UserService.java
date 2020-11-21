package com.wansboods.nacosmicroknife4j.microknife4juser.service;

import com.wansboods.common.domain.User;

import java.util.List;

/**
 * @Author sean.wan
 * @email 164170237@qq.com
 * @description
 * @Date 2020/11/21 17:44
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
