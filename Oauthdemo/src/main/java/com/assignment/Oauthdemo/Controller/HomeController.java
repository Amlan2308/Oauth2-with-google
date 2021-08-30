package com.assignment.Oauthdemo.Controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "Home page without authentication";
    }

    @GetMapping("/restricted")
    @ResponseBody
    public Principal security(Principal principal){
        return principal;
    }
}
