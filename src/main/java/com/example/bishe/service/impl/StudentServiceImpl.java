package com.example.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bishe.mapper.StudentMapper;
import com.example.bishe.pojo.Student;
import com.example.bishe.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassNam: StudentServiceImpl
 * Description:
 *
 * @Author UWZ
 * @Create 2024/3/3  23:10
 * @Version 1.0
 */
@Service("studentServiceImpl")
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
