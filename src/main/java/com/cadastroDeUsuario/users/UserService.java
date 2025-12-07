package com.cadastroDeUsuario.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getAllUsers() {
        return "users";
    }
}
