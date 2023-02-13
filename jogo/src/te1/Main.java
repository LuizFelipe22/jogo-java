package te1;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		boolean teste;
		int num, numero, pontos, nivel, tentativas, correcao;
		
		pontos = 1000;
		
		
		Random random = new Random();
		num = random.nextInt(100) + 1;
		teste = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(String.format("Você está iniciando a partida com %d. A cada erro este valor será subtraído.\n", pontos));
		
		correcao = 1;
		tentativas = 20;
		
		while (correcao == 1) {
			System.out.println("Escolha um nível de dificuldade, [1] [2] [3]:");
			nivel = scanner.nextInt();
			
			if (nivel == 1) {
				correcao = 2;
				System.out.println(String.format("Você possue %d tentativas.\n", tentativas));
			}else if (nivel == 2) {
				tentativas = 10;
				correcao = 2;
				System.out.println(String.format("Você possue %d tentativas.\n", tentativas));
			}else if (nivel == 3) {
				tentativas = 5;
				correcao = 2;
				System.out.println(String.format("Você possue %d tentativas.\n", tentativas));
			}else {
				System.out.println("Somente será aceito os valores 1, 2 ou 3.");
			}
			
		}
		
		while (teste == false || tentativas == 0) {

			System.out.println("Digite um número de 1 a 100:");
			numero = scanner.nextInt();
			
			if (numero > 100) {
				tentativas -= 1;
				System.out.println("Você perdeu 2 tentativas por digitar um número maior que 100.\n");
			}
			
			if (numero == num) {
				System.out.println("******************Parabéns você acertou o número secreto.******************\n");
				teste = true;			
		}else {
			pontos -= 20;
			tentativas -= 1;
			
			if (num > numero) {
				System.out.println(String.format("O número secreto é maior que %d.", numero));
			}else if (num < numero) {
				System.out.println(String.format("O número secreto é menor que %d.", numero));
					}
				}
			System.out.println(String.format("Resta %d tentativa(s).\n%d pontos!!", tentativas,pontos));
			System.out.println("************************************\n");
			}
		
		scanner.close();
		
		if (tentativas == 0) {
			pontos = 0;
			System.out.println(String.format("Você Perdeu, não resta mais nenhuma tentativa.\n Você terminou a partida com %d pontos.", pontos));
		}	
	}
}
