package com.wansboods.common.domain;

import lombok.*;

/**
 * @Author sean.wan
 * @email 164170237@qq.com
 * @description
 * @Date 2020/11/16 14:45
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
}
