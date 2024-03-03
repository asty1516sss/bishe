package com.example.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bishe.mapper.ClazzMapper;
import com.example.bishe.pojo.Clazz;
import com.example.bishe.service.ClazzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassNam: ClazzServiceImpl
 * Description:
 *
 * @Author UWZ
 * @Create 2024/3/3  23:04
 * @Version 1.0
 */
@Service("clazzServiceImpl")
@Transactional
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {
}
