package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá divas!");

		//Declaração de variável
		int idade = 16;
		double salario =150.00;
		char letra = 'I';
		String nome = "Isadora";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salário é: "+ salario+" reais");
		System.out.println("A letra é: "+ letra);
		System.out.println("O nome é: "+nome);
		System.out.println(chuva);
		
		//operadores
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2;
		
		System.out.println("A soma é: "+soma);
		System.out.println("A subtração é: "+sub);
		System.out.println("A divisão é: "+div);
		System.out.println("A multiplicação é: "+mult);
		System.out.println("O resto é: "+resto);
		
		//Entrada de dados
		Scanner scanner = new Scanner (System.in);
		System.out.println("Qual o seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Oiee "+ nome1);
		
		//Soma de dois números 
		int numero1;
		int numero2;
		System.out.print("Informe um núnero: ");
		numero1 = scanner.nextInt();
		System.out.print("Informe outro número ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: "+soma1);
		
		//Ano de nascimento
		int ano;
		int ano2 = 2025;
		System.out.println("Qual o ano do seu nascimento? ");
		ano = scanner.nextInt();
		int soma3 = ano2 - ano;
		System.out.println("A sua idade é: "+soma3);
		
		//Calcular descconto
		double preco;
		double desconto;
		System.out.println("Qual valor da compra?");
		preco = scanner.nextDouble();
		System.out.println("Qual valor do desconto?");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: "+ pagar);
		
		//Peça duas notas decimais, calcule a média e mostre//
		double nota;
		double nota2;
		System.out.println("Primeira nota: ");
		nota = scanner.nextDouble();
		System.out.println("Segunda nota: ");
		nota2 = scanner.nextDouble();
		double media = (nota = nota2) / 2;
		System.out.println("A Sua média é "+media);
	}

}
