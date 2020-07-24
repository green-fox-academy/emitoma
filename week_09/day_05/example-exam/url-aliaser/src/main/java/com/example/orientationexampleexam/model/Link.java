package com.example.orientationexampleexam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private String alias;

    @JsonIgnore
    @OneToOne
    private SecretCode secretCode;

    private int hitCount;

    public Link() {

    }

    public Link(String url, String alias, SecretCode secretCode) {
        this.url = url;
        this.alias = alias;
        this.secretCode = secretCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public SecretCode getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(SecretCode secretCode) {
        this.secretCode = secretCode;
    }
}
