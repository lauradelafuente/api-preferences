package br.com.fiap.challenge.preferences.model;

public class Email {

	private int id;
    private String remetente;
    private String assunto;
    private String corpo;
    
	public Email(int id, String remetente, String assunto, String corpo) {
		this.id = id;
		this.remetente = remetente;
		this.assunto = assunto;
		this.corpo = corpo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
    
    
}
