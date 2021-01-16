package cn.liamcoding.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author zhuchangli
 * @Date 2021/1/1 10:08
 **/
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String Login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
            System.out.println("userName: "+ username + "password: "+ password);
            return null;
    }
}
