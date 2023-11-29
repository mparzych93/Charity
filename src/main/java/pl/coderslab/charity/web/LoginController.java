package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @GetMapping (value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String postLogin(@RequestParam(value = "userName") String userName,
                            @RequestParam(value = "password") String password){
        System.out.println(userName + " and " + password );
        return "false";
    }
}
