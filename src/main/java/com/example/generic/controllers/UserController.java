package com.example.generic.controllers;

import com.example.generic.entities.User;
import com.example.generic.entities.keys.UserPK;
import com.example.generic.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends ControllerBase<User, UserPK> {

    public UserController(UserService service) {
        super(service);
    }

}
