package com.ricardofaria.salarioliquido.model;

public class Salario {

	private float salarioBruto;
	private float descontoInss;
	private float descontoIrpf;

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public float getDescontoInss() {
		return descontoInss;
	}

	public void setDescontoInss(float descontoInss) {
		this.descontoInss = descontoInss;
	}

	public float getDescontoIrpf() {
		return descontoIrpf;
	}

	public void setDescontoIrpf(float descontoIrpf) {
		this.descontoIrpf = descontoIrpf;
	}

}
