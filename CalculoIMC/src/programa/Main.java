package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
				
		System.out.println("Digite sua altura em CM: ");
		double altura = scan.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC é %.2f:", imc);
		System.out.println();
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do seu peso ideal");
		
		} else if(imc > 18.6 && imc < 24.9) {
			System.out.println("Você está no seu peso ideal");
		} else if(imc > 25.0 && imc < 29.9) {
			System.out.println("Você está com sobrepeso");
			
		}else if(imc > 30.0 && imc < 34.9) {
			System.out.println("Você está com obesidade nível 1");
		} else if ( imc > 35 && imc < 39.9) {
			System.out.println("Você está com obesidade nível 2");
			
		}else if (imc > 40.0) {
			System.out.println("Você está com obesidade nível 3");
		}
		
		
		
		scan.close();

	}

}
