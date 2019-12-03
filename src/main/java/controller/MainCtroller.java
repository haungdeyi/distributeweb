package controller;

import com.huangdeyi.distribute.custom.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCtroller {
    @RequestMapping("/linkToMainPage")
    public String linkToMainPage(){
        return "main";
    }


    /**
     * 在进入控制器方法之前会先调用这个方法
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setValidator(new UserValidator());
    }

}
