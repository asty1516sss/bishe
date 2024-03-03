package com.example.bishe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassNam: AdminController
 * Description:异步交互需添加@ResponseBody，
 *    //@RestController是一个组合注解，它包含了@Controller和@ResponseBody两个注解的功能
 *    //@RequestMapping表示共享映射，如果没有指定请求方式，将接收GET、POST、HEAD、OPTIONS、
 *      PUT、PATCH、DELETE、TRACE、CONNECT所有的HTTP请求方式。
 *
 * @Author UWZ
 * @Create 2024/3/3  23:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/sms/adminController")//smart compass manager system
public class AdminController {
}
