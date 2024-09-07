package model;

import model.base.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato model.base.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
