package com.example.thymeleafwhitespace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ExampleController {

    @RequestMapping(path = {"/", "/index"}, method=RequestMethod.GET)
    public String index() {
        return "main";
    }
    
    
}
