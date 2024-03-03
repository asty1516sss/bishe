package com.example.bishe.controller;

import com.example.bishe.util.CreateVerifiCodeImage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * ClassNam: SystemController
 * Description:
 *
 * @Author UWZ
 * @Create 2024/3/3  23:31
 * @Version 1.0
 */
@RestController
@RequestMapping("/sms/system")
public class SystemController {
    @GetMapping("/getVerifiCodeImage")

    public void getVerifiCodeImage(HttpServletRequest request , HttpServletResponse response){

        //使用工具类CreateVerifiCodeImage类获取图片
        BufferedImage verifiCodeImage = CreateVerifiCodeImage.getVerifiCodeImage();

        //获取图片上的验证码
        //原格式为char用String获取验证码，
        String verifiCode = new String(CreateVerifiCodeImage.getVerifiCode());
        // 将验证码文本放入session域 ，为下一次登录验证做准备
        HttpSession session = request.getSession();
        session.setAttribute("verifiCode", verifiCode);//从session获取名称需要一致"verifiCode"
        // 将验证码图片响应给浏览器
        //response.getOutputStream()获取输出流
        //使用ImageIO工具类
        //(放入图片对象，格式，输出流)
        try {
            ImageIO.write(verifiCodeImage,"JPEG",response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
