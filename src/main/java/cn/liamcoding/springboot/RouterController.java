package cn.liamcoding.springboot;

import cn.liamcoding.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Author liam
 * @Date 2021/1/2 17:22
 **/
@Controller
public class RouterController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("demo","测试");
        User user = new User();
        user.setUserName("liam");
        user.setPassword("123456");
        model.addAttribute("user",user);
        return "index";
    }
}
