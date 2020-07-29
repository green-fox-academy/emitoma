package com.example.restworkshop.service;

import com.example.restworkshop.model.enities.Log;
import com.example.restworkshop.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
     Log newLog = logRepository.save(new Log(createdAt, endpoint, data));
     entriesList(newLog);
     return newLog;
    }

    public List<Log> findAll(){
        return (List<Log>) logRepository.findAll();
    }

    public ArrayList<Log> entriesList(Log log){
        ArrayList<Log> entries = new ArrayList<>();
        entries.add(log);
        return entries;
    }
}
