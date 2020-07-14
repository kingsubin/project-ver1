package me.soob.projectver1.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/user/*")
@Controller
public class UserController {

    @GetMapping("/user")
    public String getUserIndex() {
        return "user/user";
    }


}
