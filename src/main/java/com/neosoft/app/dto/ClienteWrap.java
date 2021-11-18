package com.neosoft.app.dto;

import com.neosoft.app.entities.Cliente;
import lombok.Data;

@Data
public class ClienteWrap {
    private Cliente cliente;
    private int status;
    private String message;

    public ClienteWrap(Cliente cliente, int status, String message) {
        this.cliente = cliente;
        this.status = status;
        this.message = message;
    }
}
