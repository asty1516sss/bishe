package com.example.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bishe.mapper.TeacherMapper;
import com.example.bishe.pojo.Teacher;
import com.example.bishe.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassNam: TeacherServiceImpl
 * Description:
 *
 * @Author UWZ
 * @Create 2024/3/3  23:13
 * @Version 1.0
 */
@Service("teacherServiceImpl")
@Transactional
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

}
