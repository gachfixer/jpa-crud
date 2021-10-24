package com.crud.crud;

import com.crud.crud.domain.Customers;
import com.crud.crud.domain.Users;
import com.crud.crud.repositories.CustomerRepository;
import com.crud.crud.repositories.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

    @Autowired
    UsersRepository usersRepository;


    private static final Logger log = LoggerFactory.getLogger(CrudApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {

            //RestTemplate restTemplate = new RestTemplate();

            //String quote = restTemplate.getForObject(
                 //   "http://139.59.160.251/usrTechn/GetLocations.action", String.class);
          //  log.info(quote);

            log.info("");
            Users users = new Users();
            users.setUserEmail("josephgacher@gmail.com");
            users.setUserFirstName("Joseph");
            users.setUserPassword("okaka");
            users.setUserLastName("Gacheru");
            users.setUserPhone("0719436076");

            usersRepository.save(users);
            log.info(users.getUserId() + " pl");
            //List<Users> usersList = usersRepository.findByuser_email("josephgacher@gmail.com");

            usersRepository.findUsersByUserEmail("josephgacher@gmail.com").forEach(person -> {
                log.info(person.getUserEmail());
            });
            ;
          // save a few customers
           /* repository.save(new Customers("Jack", "Bauer"));
            repository.save(new Customers("Chloe", "O'Brian"));
            repository.save(new Customers("Kim", "Bauer"));
            repository.save(new Customers("David", "Palmer"));
            repository.save(new Customers("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customers customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customers customer = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastname("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
            Users users = new Users();
            users.setUserEmail("josephgacher@gmail.com");
            users.setUserFirstName("Joseph");
            users.setUserPassword("okaka");
            users.setUserLastName("Gacheru");
            users.setUserPhone("0719436076");

            usersRepository.save(users);
            //List<Users> usersList = usersRepository.findByuser_email("josephgacher@gmail.com");

            usersRepository.findUsersByUserEmail("josephgacher@gmail.com").forEach(person -> {
                log.info(person.getUserEmail());
            });*/
        };
    }




}
