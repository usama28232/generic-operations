package com.example.generic.services;

import com.example.generic.repositories.RepositoryBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ServiceBase<T, ID> {

    @Value("${app.default.page.size:20}")
    private int defaultPageSize;

    private RepositoryBase<T, ID> repository;

    public ServiceBase(RepositoryBase<T, ID> repository) {
        this.repository = repository;
    }

    public Optional<T> findOneById(ID entity) {
        return this.repository.findById(entity);
    }

    public Page<T> findAll(Pageable pageable) {
        if (pageable == null || pageable.getPageSize() == 0) {
            pageable = PageRequest.of(0, defaultPageSize);
        }
        return this.repository.findAll(pageable);
    }

}
