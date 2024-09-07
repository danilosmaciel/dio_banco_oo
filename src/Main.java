import model.Banco;
import model.Cliente;
import model.base.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		var banco = new Banco();
		var venilton = new Cliente();

		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		banco.setContas(List.of(cc, poupanca));

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		banco.listaTodosOsCliente();
		banco.listaDadosContas();
	}

}
