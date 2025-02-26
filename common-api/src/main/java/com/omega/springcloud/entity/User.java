package com.omega.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Class User
 *
 * @author KennySo
 * @date 2024/12/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Long id;
    private String name;
    private String pwd;
    private String mobile;
    private String email;
    private Integer gender;
}
