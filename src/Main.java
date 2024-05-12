
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Gilberto","123.121.143-96", "88888899");

		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
