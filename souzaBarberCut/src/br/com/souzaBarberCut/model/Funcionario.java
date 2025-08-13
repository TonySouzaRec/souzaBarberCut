package br.com.souzaBarberCut.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
	private LocalDate dataContratacao;
	private BigDecimal salario;
	private String cargo;
	
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
