package com.example.generic.services;

import com.example.generic.entities.User;
import com.example.generic.entities.keys.UserPK;
import com.example.generic.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceBase<User, UserPK> {

    public UserService(UserRepository repository) {
        super(repository);
    }
}
