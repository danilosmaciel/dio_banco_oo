package model;

import model.base.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato model.base.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
