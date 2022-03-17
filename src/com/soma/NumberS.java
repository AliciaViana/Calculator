package com.soma;

import java.util.Scanner;

public class NumberS {

	public static void main(String[] args) {

		ApoioSoma numero = new ApoioSoma();
		Scanner myObj = new Scanner(System.in);
		// int a, b, c, =0;

		System.out.println("Insira um numero: ");
		int somatorio = myObj.nextInt();

		System.out.println("Insira outro numero: ");
		int carregaSegundaSoma = myObj.nextInt();

		int valorTotal = numero.carregaTotal(somatorio);
		System.out.println("Sua soma é: " + valorTotal);

	}

}
