package br.com.fiap.challenge.preferences.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.challenge.preferences.model.UserSettings;
import br.com.fiap.challenge.preferences.service.UserSettingsService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/user-settings")
public class UserSettingsController {

    @Autowired
    private UserSettingsService userSettingsService;

    @GetMapping
    public List<UserSettings> getAllUserSettings() {
        return userSettingsService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserSettings> getUserSettingsById(@PathVariable Long id) {
        Optional<UserSettings> userSettings = userSettingsService.findById(id);
        return userSettings.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserSettings createUserSettings(@RequestBody UserSettings userSettings) {
        return userSettingsService.save(userSettings);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserSettings> updateUserSettings(
            @PathVariable Long id, @RequestBody UserSettings userSettingsDetails) {
        Optional<UserSettings> userSettings = userSettingsService.findById(id);
        if (userSettings.isPresent()) {
            UserSettings existingSettings = userSettings.get();
            existingSettings.setTema(userSettingsDetails.getTema());
            existingSettings.setCor(userSettingsDetails.getCor());
            existingSettings.setCategoria(userSettingsDetails.getCategoria());
            existingSettings.setGrupo(userSettingsDetails.getGrupo());
            userSettingsService.save(existingSettings);
            return ResponseEntity.ok(existingSettings);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserSettings(@PathVariable Long id) {
        userSettingsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
