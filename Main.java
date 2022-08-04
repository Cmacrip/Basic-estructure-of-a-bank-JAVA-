public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Caio");
		
		Conta cc = new ContaCorrente(caio);
		Conta poupanca = new ContaPoupanca(caio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}