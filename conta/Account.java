public class Account {
	// Atributos / variáveis de instância
	private String name;  // variável de instância - ou atributo	
	// criar uma variável de instância do tipo double cujo nome é balance
	private double balance;
	
	// construtor
	public Account(String name, double balance) {  // inicializará a classe com um nome
		this.name = name;
		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	// método para definir o nome
	public void setName(String newName) {
		name = newName;
	}
	
	// método para obter o valor do nome
	public String getName() {
		return name;
	}
	
	// método para retornar o saldo
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		// se a quantia (amount) é positiva soma ao saldo
		if (amount > 0) {
			balance = balance + amount;
			// balance += amount;
		}
	}
}