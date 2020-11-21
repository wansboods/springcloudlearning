package com.wansboods.nacosmicroknife4j.microknife4jorder.service;

import com.wansboods.common.domain.Order;

/**
 * @Author sean.wan
 * @email 164170237@qq.com
 * @description
 * @Date 2020/11/21 21:27
 */
public interface OrderService {
    void create(Order order);

    Order getOrder(Long id);

    void update(Order order);

    void delete(Long id);
}
