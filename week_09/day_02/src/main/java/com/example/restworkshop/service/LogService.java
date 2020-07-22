package com.example.restworkshop.service;

import com.example.restworkshop.model.enities.Log;
import com.example.restworkshop.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LogService {
    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Log saveLog(String endpoint, Date createdAt, String data) {
     return logRepository.save(new Log(createdAt, endpoint, data));
    }

    public List<Log> findAll(){
        return (List<Log>) logRepository.findAll();
    }
}
