package com.neosoft.app.services;

import com.neosoft.app.entities.Cliente;
import com.neosoft.app.repository.ClienteCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll() {
        return (List<Cliente>)clienteCrudRepository.findAll();
    }

    public Cliente save(Cliente cliente){
        return clienteCrudRepository.save(cliente);
    }

    public Optional<Cliente> getClient(Long clienteId){
        return clienteCrudRepository.findById(clienteId);
    }

    public boolean delete(Long clienteId) {
        if (getClient(clienteId).isPresent()){
            clienteCrudRepository.deleteById(clienteId);
            return true;
        } else {
            return false;
        }
    }
}
