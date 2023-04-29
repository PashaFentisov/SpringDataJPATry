package com.example.springdatajpatry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repo.AddressRepository;
import repo.ClientsRepository;
import service.ClientService;

@SpringBootApplication(scanBasePackages = "service")
@EntityScan(basePackages = "pojo")
@EnableJpaRepositories(basePackages = "repo")
public class SpringDataJpaTryApplication {
    public static void main(String[] args) {
        var c = SpringApplication.run(SpringDataJpaTryApplication.class, args);
        ClientsRepository cr = c.getBean(ClientsRepository.class);
        AddressRepository ar = c.getBean(AddressRepository.class);
        ClientService clientService = c.getBean(ClientService.class);

        System.out.println(clientService.getClient(1));

    }
}
