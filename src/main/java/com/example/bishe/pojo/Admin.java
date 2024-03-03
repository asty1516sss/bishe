package com.example.bishe.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassNam: Admin
 * Description:
 *
 * @Author UWZ
 * @Create 2024/3/3  21:29
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_admin")
public class Admin {
    @TableId(value = "id" , type = IdType.AUTO)
    private Integer id;
    private String name;
    private char gender;
    private String password;
    private String telephone;
    private String address;
    private String portraitPath;//头像的图片路径
}
