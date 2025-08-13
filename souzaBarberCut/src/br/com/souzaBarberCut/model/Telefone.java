package br.com.souzaBarberCut.model;

public class Telefone {

	private Integer idTelefone;
	private String dddEstado;
	private String numero;
	private String tipoTelefone;
	private boolean whatsApp;
	private String email;
	
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getDddEstado() {
		return dddEstado;
	}
	public void setDddEstado(String dddEstado) {
		this.dddEstado = dddEstado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public boolean isWhatsApp() {
		return whatsApp;
	}
	public void setWhatsApp(boolean whatsApp) {
		this.whatsApp = whatsApp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
