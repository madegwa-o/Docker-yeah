package com.example.first;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseLoader {
    private final PersonRepo personRepo;
    @Bean
    public CommandLineRunner init(){
        return args -> {
            Person person1 = new Person("Oscar");
            Person person2 = new Person("Le Bron");
            Person person3 = new Person("Jordan");
            Person person4 = new Person("Kyrie");

            personRepo.save(person1);
            personRepo.save(person2);
            personRepo.save(person3);
            personRepo.save(person4);


        };
    }
}
