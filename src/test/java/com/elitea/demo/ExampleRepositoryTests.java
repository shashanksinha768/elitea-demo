package com.elitea.demo;

import com.elitea.demo.model.ExampleItem;
import com.elitea.demo.repository.ExampleItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ExampleRepositoryTests {

    @Autowired
    private ExampleItemRepository repository;

    @Test
    public void saveAndFind() {
        ExampleItem item = new ExampleItem("test");
        ExampleItem saved = repository.save(item);
        assertThat(saved.getId()).isNotNull();
    }
}
