package com.example.bishe.util;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassNam: AuthContextHolder
 * Description:对JwtHelper再封装
 *
 * @Author UWZ
 * @Create 2024/3/3  21:16
 * @Version 1.0
 */
public class AuthContextHolder {

    //从请求头token获取userid
    public static Long getUserIdToken(HttpServletRequest request) {
        //从请求头token
        String token = request.getHeader("token");
        //调用工具类
        Long userId = JwtHelper.getUserId(token);
        return userId;
    }

    //从请求头token获取name
    public static String getUserName(HttpServletRequest request) {
        //从header获取token
        String token = request.getHeader("token");
        //jwt从token获取username
        String userName = JwtHelper.getUserName(token);
        return userName;
    }
}

