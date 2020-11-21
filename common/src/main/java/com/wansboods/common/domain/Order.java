package com.wansboods.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @Author sean.wan
 * @email 164170237@qq.com
 * @description
 * @Date 2020/11/21 21:28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
