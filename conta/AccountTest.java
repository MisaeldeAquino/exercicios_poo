public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account("Rodrigo", 0);  // constrói um objeto de conta
		Account a2 = new Account("José", 1000);
				
		// Imprime o resultado de getName 
		System.out.println("O nome na conta 1 é: " + a1.getName() + " e o saldo é: " 
				+ a1.getBalance());
		System.out.println("O nome na conta 2 é: " + a2.getName() + " e o saldo é: " 
				+ a2.getBalance());	
		
		a1.deposit(-10);
		System.out.println("Saldo de a1: " + a1.getBalance());
		a2.deposit(100);
		System.out.println("Saldo de a2: " + a2.getBalance());
	}
}