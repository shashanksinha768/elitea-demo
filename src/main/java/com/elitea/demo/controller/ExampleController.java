package com.elitea.demo.controller;

import com.elitea.demo.model.ExampleItem;
import com.elitea.demo.repository.ExampleItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ExampleController {

    private final ExampleItemRepository repository;

    public ExampleController(ExampleItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ExampleItem> list() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ExampleItem> create(@RequestBody ExampleItem item) {
        ExampleItem saved = repository.save(item);
        return ResponseEntity.created(URI.create("/api/v1/items/" + saved.getId())).body(saved);
    }
}
