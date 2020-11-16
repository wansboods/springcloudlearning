package com.wansboods.nacosfeignservice.service.impl;

import com.wansboods.common.domain.CommonResult;
import com.wansboods.common.domain.User;
import com.wansboods.nacosfeignservice.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author sean.wan
 * @email 164170237@qq.com
 * @description
 * @Date 2020/11/16 21:50
 */
@Component
public class UserFallbackService implements UserService {
    @Override
    public CommonResult create(User user) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getByUsername(String username) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult update(User user) {
        return new CommonResult("调用失败，服务被降级",500);
    }

    @Override
    public CommonResult delete(Long id) {
        return new CommonResult("调用失败，服务被降级",500);
    }
}
