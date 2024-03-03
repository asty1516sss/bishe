package com.example.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bishe.mapper.GradeMapper;
import com.example.bishe.pojo.Grade;
import com.example.bishe.service.GradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassNam: GradeServiceImpl
 * Description:
 *
 * @Author UWZ
 * @Create 2024/3/3  23:08
 * @Version 1.0
 */
@Service("gradeServiceImpl")
@Transactional
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
}
