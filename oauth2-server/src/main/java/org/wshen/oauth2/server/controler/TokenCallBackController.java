package org.wshen.oauth2.server.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TokenCallBackController
 * @Deacription TODO 获取 授权码
 * @Author apple
 * @Date 2020/10/25 15:02
 * @Version 1.0
 **/
@Controller
public class TokenCallBackController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/getCode")
    public void getCode(String code){
        System.out.println(code);
    }

}
