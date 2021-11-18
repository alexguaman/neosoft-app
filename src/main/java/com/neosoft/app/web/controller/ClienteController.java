package com.neosoft.app.web.controller;

import com.neosoft.app.dto.ClienteWrap;
import com.neosoft.app.entities.Cliente;
import com.neosoft.app.services.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    @ApiOperation(value = "Get all clients")
    public ResponseEntity<List<Cliente>> getAll(){

        List<Cliente> clientes = clienteService.getAll();
        if (clientes != null){
            return new ResponseEntity<>(clientes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/")
    @ApiOperation(value = "Get save a client")
    public ResponseEntity<ClienteWrap> save(@RequestBody Cliente cliente){
        ClienteWrap clienteWrap;
        if(cliente.getNombres() == null || cliente.getNombres().isEmpty()){
            clienteWrap = new ClienteWrap(null, HttpStatus.BAD_REQUEST.value(), "Debe ingresar campo nombres");
            return new ResponseEntity<>(clienteWrap, HttpStatus.BAD_REQUEST);
        }
        clienteWrap = new ClienteWrap(clienteService.save(cliente), HttpStatus.CREATED.value(), "");

        return new ResponseEntity<>(clienteWrap, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a client by Id")
    public ResponseEntity delete(@PathVariable("id") int clienteId){
        if (clienteService.delete(Long.valueOf(clienteId))) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
