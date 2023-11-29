package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.entity.User;
import pl.coderslab.charity.service.UserService;

@Controller
public class RegisterController {
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setUserName("admin");
        user.setEmail("admin@admin.pl");
        user.setPassword("admin");
        userService.saveUser(user);
        return "admin";
    }

}
