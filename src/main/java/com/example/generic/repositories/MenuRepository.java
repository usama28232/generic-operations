package com.example.generic.repositories;

import com.example.generic.entities.Menu;
import com.example.generic.entities.User;
import com.example.generic.entities.keys.MenuPK;
import com.example.generic.entities.keys.UserPK;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends RepositoryBase<Menu, MenuPK> {
}
