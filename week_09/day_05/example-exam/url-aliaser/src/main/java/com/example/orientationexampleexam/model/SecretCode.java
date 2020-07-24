package com.example.orientationexampleexam.model;

import javax.persistence.*;

@Entity
public class SecretCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int secretCode;

    @OneToOne
    private Link linkofcode;

    public SecretCode() {

    }

    public SecretCode(int secretCode) {
        this.secretCode = secretCode;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }
}
