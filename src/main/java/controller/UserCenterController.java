package controller;

import com.huangdeyi.distributed.userservice.User;
import com.huangdeyi.distributed.userservice.UserService;
import com.huangdeyi.distributed.userservice.UserServiceRequest;
import com.huangdeyi.distributed.userservice.UserServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserCenterController {

    @Autowired
    private UserService userService;

    //注册用户
    @RequestMapping("registered")
    @ResponseBody
    public  boolean registered(User user){
        return true;
    }

    //用户登录
    @RequestMapping("login")
    @ResponseBody
    public UserServiceResponse login(){
        UserServiceRequest ur = new UserServiceRequest();
        ur.setParams("麻雷子");
        UserServiceResponse response = userService.login(ur);
        return  response;
    }
}
