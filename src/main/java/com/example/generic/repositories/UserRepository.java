package com.example.generic.repositories;

import com.example.generic.entities.User;
import com.example.generic.entities.keys.UserPK;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends RepositoryBase<User, UserPK> {
}
