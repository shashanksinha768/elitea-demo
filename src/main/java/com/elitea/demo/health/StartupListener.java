package com.elitea.demo.health;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupListener {

    @EventListener(ApplicationReadyEvent.class)
    public void onReady() {
        System.out.println("elitea-capstone-project started successfully");
    }
}
