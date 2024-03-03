package com.example.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bishe.mapper.AdminMapper;
import com.example.bishe.pojo.Admin;
import com.example.bishe.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassNam: AdminServiceImpl
 * Description:
 * ServiceImpl有对AminService 继承的Iservice的实现
 *   //@Service Spring识别当前组件 ,用于类上，标记当前类是一个service类，
 *              加上该注解会将当前类自动注入到spring容器中，不需要再在applicationContext.xml文件定义bean了
 *   //@Transactional 失误控制注解
 *
 * @Author UWZ
 * @Create 2024/3/3  22:55
 * @Version 1.0
 */
@Service("adminServiceImpl")
@Transactional
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
