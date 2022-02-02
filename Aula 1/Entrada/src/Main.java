import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //criar uma variavel para ler dados digitados no console
		
		System.out.println("Digite seu nome:"); //pedindo para dar dados a variavel nome
		String nome = entrada.next(); //recebendo dados da variavel nome
		
		System.out.println("Digite sua idade:"); //pedindo para dar dados a variavel idade
		Integer idade = entrada.nextInt(); //recebendo dados da variavel idade
		
		System.out.println("O nome do aluno é " +nome+ " e ele tem " +idade+ " anos"); //mostrar uma frase com os dados adquiridps
		
	}
	
}
