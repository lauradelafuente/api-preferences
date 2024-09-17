package br.com.fiap.challenge.preferences.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.challenge.preferences.model.UserSettings;
import br.com.fiap.challenge.preferences.repository.UserSettingsRepository;

@Service
public class UserSettingsService {

    @Autowired
    private UserSettingsRepository userSettingsRepository;

    public List<UserSettings> findAll() {
        return userSettingsRepository.findAll();
    }

    public Optional<UserSettings> findById(Long id) {
        return userSettingsRepository.findById(id);
    }

    public UserSettings save(UserSettings userSettings) {
        return userSettingsRepository.save(userSettings);
    }

    public void deleteById(Long id) {
        userSettingsRepository.deleteById(id);
    }
}
