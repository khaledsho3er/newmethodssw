package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usercontroller{
@GetMapping("signup1")
public String signupform(){
    return "signup.html";
}



@GetMapping("home")
public String homepage(){
    return "home.html";
}
}