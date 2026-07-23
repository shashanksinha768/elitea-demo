package com.elitea.demo.service;

import com.elitea.demo.model.ExampleItem;
import com.elitea.demo.repository.ExampleItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    private final ExampleItemRepository repository;

    public ExampleService(ExampleItemRepository repository) {
        this.repository = repository;
    }

    public List<ExampleItem> findAll() {
        return repository.findAll();
    }

    public ExampleItem save(ExampleItem item) {
        return repository.save(item);
    }
}
