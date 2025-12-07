package com.cadastroDeUsuario.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService user;
    public UserController(UserService user) {
        this.user = user;
    }

    @GetMapping()
    public String getUsers() {
        return user.getAllUsers();
    }
}
