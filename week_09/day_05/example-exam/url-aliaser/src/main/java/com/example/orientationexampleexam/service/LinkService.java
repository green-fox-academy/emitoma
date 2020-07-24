package com.example.orientationexampleexam.service;

import com.example.orientationexampleexam.model.Link;
import com.example.orientationexampleexam.model.SecretCode;
import com.example.orientationexampleexam.repository.LinkRepository;
import com.example.orientationexampleexam.repository.SecretCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class LinkService {

    private LinkRepository linkRepository;
    private SecretCodeRepository secretCodeRepository;

    @Autowired

    public LinkService(LinkRepository linkRepository, SecretCodeRepository secretCodeRepository) {
        this.linkRepository = linkRepository;
        this.secretCodeRepository = secretCodeRepository;
    }

    public Link saveNewLink(String url, String alias) {
        return linkRepository.save(new Link(url, alias, generateSecretCode()));
    }

    public SecretCode generateSecretCode() {
        Random random = new Random();

        int firstDigit = (random.nextInt(9)) * 1000;
        int secondDigit = (random.nextInt(9)) * 100;
        int thirdDigit = (random.nextInt(9)) * 10;
        int fourthDigit = (random.nextInt(9) + 0) * 1;

        int makeCode = firstDigit + secondDigit + thirdDigit + fourthDigit;

        SecretCode secretCode = new SecretCode(makeCode);
        secretCodeRepository.save(secretCode);
        return secretCode;
    }

    public Optional<Link> findLinkInDb(String url) {
        return linkRepository.findByUrl(url);
    }

}
