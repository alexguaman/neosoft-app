package com.neosoft.app.repository;

import com.neosoft.app.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteCrudRepository extends CrudRepository<Cliente, Long> {

}
