package br.com.fiap.challenge.preferences.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.challenge.preferences.model.UserSettings;

@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long> {

}
