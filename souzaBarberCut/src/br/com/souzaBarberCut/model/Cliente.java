package br.com.souzaBarberCut.model;

import java.time.LocalDate;

public class Cliente extends Pessoa {

	private LocalDate dataCadastro;
	private String preferenciaCorte;

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getPreferenciaCorte() {
		return preferenciaCorte;
	}

	public void setPreferenciaCorte(String preferenciaCorte) {
		this.preferenciaCorte = preferenciaCorte;
	}

}
