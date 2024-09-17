package br.com.fiap.challenge.preferences.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_settings")
public class UserSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tema; // dark ou light

    @Column(nullable = false)
    private String cor; // azul, vermelho

    @Column(nullable = false)
    private String categoria; // trabalho, pessoal

    @Column(nullable = false)
    private String grupo; // importante, aviso

    public UserSettings() {}

	public UserSettings(Long id, String tema, String cor, String categoria, String grupo) {
		this.id = id;
		this.tema = tema;
		this.cor = cor;
		this.categoria = categoria;
		this.grupo = grupo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
    
}
