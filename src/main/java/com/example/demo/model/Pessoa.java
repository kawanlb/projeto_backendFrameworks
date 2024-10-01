package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "tabela_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    private int idade;

    private String cpf;
}
