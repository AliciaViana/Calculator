package com.soma;

import java.util.Scanner;

public class NumberS {

	public static void main(String[] args) {

		Calcular calcular = new Calcular();
		Scanner myObj = new Scanner(System.in);

		System.out.println("Insira um numero: ");
		int numero1 = myObj.nextInt();

		System.out.println("Insira outro numero: ");
		int numero2 = myObj.nextInt();

		int valorTotal = calcular.realiazaSoma(numero1, numero2);
		System.out.println("Sua soma é: " + valorTotal);
	}

}
