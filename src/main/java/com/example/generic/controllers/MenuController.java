package com.example.generic.controllers;

import com.example.generic.entities.Menu;
import com.example.generic.entities.User;
import com.example.generic.entities.keys.MenuPK;
import com.example.generic.entities.keys.UserPK;
import com.example.generic.services.MenuService;
import com.example.generic.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController extends ControllerBase<Menu, MenuPK> {

    public MenuController(MenuService service) {
        super(service);
    }

}
