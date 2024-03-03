package com.example.bishe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassNam: LoginForm
 * Description:用户登录表单信息
 *
 * @Author UWZ
 * @Create 2024/3/3  22:33
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginForm {

    private String username;
    private String password;
    private String verifiCode;
    private Integer userType;

}