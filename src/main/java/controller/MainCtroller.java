package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCtroller {
    @RequestMapping("/linkToMainPage")
    public String linkToMainPage(){
        return "main";
    }
}
