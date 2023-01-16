package com.example.generic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@NoRepositoryBean
public interface RepositoryBase<T, ID> extends JpaRepository<T, ID> {

    Optional<T> findById(ID id);

    // ....
}
