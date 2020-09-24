/*O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido".

nConta -> 1
saldoInical -> 1000
itensCobrados -> 500 (despesas)
creditosAplicados -> 100
limiteCredito -> 2000

saldo = saldoInical + itensCobrados - creditosAplicados

se saldo > limiteCredito
	imprime "Limite de crédito excedido"

do {
} while
*/
import java.util.Scanner;

public class LimiteCredito {
	public static void main(String[] args) {
		char continua = 's';
		Scanner entrada = new Scanner(System.in);
		
		while (continua == 's') {			
			System.out.print("Informe o número da conta (-1 para terminar): ");
			int conta = entrada.nextInt();
			System.out.print("Informe o saldo inicial: ");
			int saldoInicial = entrada.nextInt();
			System.out.print("Informe o total dos itens cobrados: ");
			int itensCobrados = entrada.nextInt();
			System.out.print("Informe o total de créditos aplicados: ");
			int creditosAplicados = entrada.nextInt();
			System.out.print("Informe o limite de crédito: ");
			int limiteCredito = entrada.nextInt();
			entrada.nextLine();
			
			int saldo = saldoInicial + itensCobrados - creditosAplicados;
			System.out.printf("Conta %d\nSaldo inicial: R$ %,d\nSaldo final: R$ %,d\n", conta, 
						saldoInicial, saldo);
						
			if (saldo > limiteCredito) {
				System.out.println("Limite de crédito excedido");
			}
			
			System.out.print("Continua? (s/n): ");
			String str = entrada.nextLine();
			continua = str.charAt(0);
		}
		System.out.println("Fim do programa.");
	}
}
