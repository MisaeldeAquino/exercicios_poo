/*Uma faculdade oferece um curso que prepara os candidatos a obter licença estadual para corretores de
imóveis. No ano passado, dez alunos que concluíram esse curso prestaram o exame. A universidade 
quer saber como foi o desempenho dos seus alunos nesse exame. 
Você foi contratado para escrever um programa que resuma os resultados. 
Para tanto, você recebeu uma lista desses 10 alunos. Ao lado de cada nome é escrito '1' 
se o aluno passou no exame ou '2' se o aluno foi reprovado.
Seu programa deve analisar os resultados do exame assim:
1. Dê entrada a cada resultado do teste (isto é, um 1 ou um 2). 
	Exiba a mensagem "Inserir resultado" na tela toda vez que o programa solicitar o 
	resultado de outro teste.
2. Conte o número de cada tipo de resultado.
3. Exiba um resumo dos resultados do teste indicando o número de alunos aprovados e reprovados.
4. Se mais de oito estudantes forem aprovados no exame, imprima "Bonus ao instrutor!".

Exemplo de lista:

Fulano 1
Beltrano 2
Cicrano 1
....
Gumercindo 1
Felisberto 2

- informar o resultado de 10 testes
	- não é necessário informar o nome dos alunos
- contar cada um dos resultados (aprovado - 1, reprovado - 2)
- exibir o total de cada um dos resultados
- se aprovados > 8 imprimir mensagem "Bonus ao instrutor"
*/
import java.util.Scanner;
// Receber e analisar resultados e informar se um bônus deve ser pago
public class Analise {
	public static void main(String[] args) {
		// Inicializar variáveis (contagem)
		// inicializar aprovações com 0
		int aprovacoes = 0;
		// inicializar reprovações com 0
		int reprovacoes = 0;
		// inicializa o scanner para entrada de dados
		Scanner entrada = new Scanner(System.in);

		int resultado;
		int i = 0;
		// Receber dados de 10 testes e contar os aprovados e reprovados
		// enquanto o contador for menor que 10
		do {
			//   pede o resultado de um teste para o usuário
			System.out.printf("Insira resultado %d (1 ou 2, -1 para terminar): ", i+1);
			//   leia o resultado o teste
			resultado = entrada.nextInt();
			//   se o resultado for aprovado incremente o contador de aprovados
			if (resultado == 1) { aprovacoes++; }
			//   senao incremente o contador de reprovados
			else if (resultado == 2) { reprovacoes++; }
			i++;
		} while (resultado != -1);
		// Exibir os resultados e decidir se há ou não bônus.
		// imprimir o número de aprovados
		System.out.println("Aprovados: " + aprovacoes);
		// imprimir o número de reprovados
		System.out.println("Reprovados: " + reprovacoes);
		// se aprovados > 8 imprimir "bonus ao instrutor"
		if (aprovacoes > 8) {
			System.out.println("Bônus ao instrutor");
		}
	}
}




