package com.soma;

import java.util.Scanner;

public class NumberS {

	public static void main(String[] args) {

		Calcular calcular = new Calcular();
		Scanner myObj = new Scanner(System.in);

		System.out.println("Escolha qual operação deseja realizar; " + "\n1 - P/Soma; \n2 - P/Multiplicação; ");
		int soma = myObj.nextInt();
		if (soma == 1) {

			System.out.println("Insira um numero: ");
			int numero1 = myObj.nextInt();

			System.out.println("Insira um numero: ");
			int numero = myObj.nextInt();

			int valorTotal = calcular.realiazaSoma(numero1, numero);
			System.out.println("Sua soma é: " + valorTotal);

		} else {

			System.out.println("Insira um numero: ");
			int numero1 = myObj.nextInt();

			System.out.println("Insira um numero: ");
			int numero2 = myObj.nextInt();

			int valorRetorno = calcular.realiazaMultiplicacao(numero1, numero2);
			System.out.println("Sua Multiplicação é: " + valorRetorno);

		}

	}

}
