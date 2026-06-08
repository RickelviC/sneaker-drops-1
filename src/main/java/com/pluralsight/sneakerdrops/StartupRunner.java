package com.pluralsight.sneakerdrops;

import com.pluralsight.sneakerdrops.service.DropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final DropService runner;

    @Autowired
    public StartupRunner(DropService runner) {
        this.runner = runner;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(runner.getStatus());
    }

}
