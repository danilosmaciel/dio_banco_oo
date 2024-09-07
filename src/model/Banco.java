package model;

import model.base.Conta;
import model.interfaces.IConta;
import model.interfaces.VerfiicarTipoConta;
import model.interfaces.VerificaSehContaCorrente;

import java.util.List;

public class Banco implements VerfiicarTipoConta {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listaTodosOsCliente(){
		System.out.println("===================================================");
		System.out.println("============== Listagem dos Clientes ==============");
		System.out.println("===================================================");
		getContas().forEach(System.out::println);
		System.out.println("----------------------------------------------------");
		System.out.printf("Total:%d%n", getContas().size());
		System.out.println("===================================================\n\n");

	}

	public void listaDadosContas(){
		System.out.println("===================================================");
		System.out.println("=============== Listagem de contas ===============");
		System.out.println("===================================================");
		System.out.printf("Total de Contas Correntes:%d\nTotal de Contas Poupancas:%d\nTotal:%d%n",
				getContas().stream().filter(this::ehCorrente).count(),
				getContas().stream().filter(this::ehPoupanca).count(),
				getContas().size());
		System.out.println("===================================================");

	}

	@Override
	public boolean ehCorrente(IConta conta) {
		return conta instanceof ContaCorrente;
	}

	@Override
	public boolean ehPoupanca(IConta conta) {
		return conta instanceof ContaPoupanca;
	}

	;
}
