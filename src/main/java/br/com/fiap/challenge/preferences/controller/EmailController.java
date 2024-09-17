package br.com.fiap.challenge.preferences.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.challenge.preferences.model.Email;
import br.com.fiap.challenge.preferences.repository.MockEmailRepository;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private MockEmailRepository mockEmailRepository;

    @GetMapping("/mock")
    public List<Email> getMockEmails() {
        return mockEmailRepository.getMockEmails();
    }

    @GetMapping("/spam")
    public List<Email> getSpamEmails() {
        return mockEmailRepository.getSpamEmails();
    }
}
