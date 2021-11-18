package com.neosoft.app.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteid;
    private String nombres;
    private String email;
    private Integer edad;

}
