package com.elitea.demo.repository;

import com.elitea.demo.model.ExampleItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleItemRepository extends JpaRepository<ExampleItem, Long> {
}
