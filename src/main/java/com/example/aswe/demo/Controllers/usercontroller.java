package com.example.aswe.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usercontroller

{
@GetMapping("signup1")
public String signupform(){
    return "signup.html";
}



@GetMapping("user")
public String homepage(){
    return "Redirect:home.html";
}
    
}
