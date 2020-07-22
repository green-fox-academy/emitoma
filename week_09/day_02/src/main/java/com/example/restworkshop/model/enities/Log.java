package com.example.restworkshop.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Log {
    @Id
    private Date createdAt;
    private String endpoint;
    private String data;

    public Log(Date createdAt, String endpoint, String data) {
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.data = data;
    }
}
