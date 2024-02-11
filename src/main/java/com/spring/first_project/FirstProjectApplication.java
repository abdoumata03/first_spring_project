package com.spring.first_project;

import com.spring.first_project.entities.Civility;
import com.spring.first_project.entities.Client;
import com.spring.first_project.entities.Compte;
import com.spring.first_project.repository.ClientRepository;
import com.spring.first_project.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {


    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CompteRepository compteRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client(null, "Abdallah", "a.matallah@esi-sba.dz", Civility.Homme, null);
        Client client2 = new Client(null, "Mohammed", "m.belhadj@esi-sba.dz", Civility.Homme, null);
        Client client3 = new Client(null, "Meriem", "m.matallah@esi-sba.dz", Civility.Femme, null);

        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);
        clientRepository.findAll().forEach(System.out::println);

        Client c = clientRepository.findById(2L).get();

        Compte compte = new Compte(null, "AA", "BB", new Date(),c);

        compteRepository.save(compte);
    }
}
