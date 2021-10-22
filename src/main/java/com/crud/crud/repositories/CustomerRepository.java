package com.crud.crud.repositories;

import java.util.List;

import com.crud.crud.domain.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers, Long> {

    List<Customers> findByLastname(String lastname);

    Customers findById(long id);
}
