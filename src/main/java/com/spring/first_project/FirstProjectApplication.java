package com.spring.first_project;

import com.spring.first_project.entities.Civility;
import com.spring.first_project.entities.Client;
import com.spring.first_project.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {


    @Autowired
    ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client(null, "Abdallah", "a.matallah@esi-sba.dz", Civility.Homme);
        Client client2 = new Client(null, "Mohammed", "m.belhadj@esi-sba.dz", Civility.Homme);
        Client client3 = new Client(null, "Meriem", "m.matallah@esi-sba.dz", Civility.Femme);

        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);


        clientRepository.findAll().forEach(System.out::println);
    }
}
