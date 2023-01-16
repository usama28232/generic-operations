package com.example.generic.services;

import com.example.generic.entities.Menu;
import com.example.generic.entities.User;
import com.example.generic.entities.keys.MenuPK;
import com.example.generic.entities.keys.UserPK;
import com.example.generic.repositories.MenuRepository;
import com.example.generic.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuService extends ServiceBase<Menu, MenuPK> {

    public MenuService(MenuRepository repository) {
        super(repository);
    }
}
