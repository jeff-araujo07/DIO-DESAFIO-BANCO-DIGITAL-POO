package BancoDigital;

public class Main {

	public static void main(String[] args) {
		// CLIENTES JEFFERSON E JÚLIO
		Cliente jefferson = new Cliente();
		Cliente julio = new Cliente();
		jefferson.setNome("Jefferson");
		julio.setNome("Júlio");
		
		// CORRENTE PERTENCE AO JEFFERSON E POUPANCA PERTENCE AO JÚLIO
		Conta corrente = new ContaCorrente(jefferson);
		Conta poupanca = new ContaPoupanca(julio);
		
		// DEPÓSITOS E EXTRATOS
		corrente.depositar(500);
		poupanca.depositar(100);
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		// SAQUE NA CONTA CONTA CORRENTE E EXTRATO
		corrente.sacar(200);
		corrente.imprimirExtrato();
	
		// JEFFERSON (CONTA CORRENTE) TRANSFERIU R$150 PARA JÚLIO (CONTA POUPANÇA) E EXTRATOS
		corrente.transferir(150, poupanca);
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}