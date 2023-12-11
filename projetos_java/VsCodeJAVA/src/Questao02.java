import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
		int valorA, valorB, valorC;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		valorA = entrada.nextInt();

		System.out.println("Valor de B: ");
		valorB = entrada.nextInt();
		
		System.out.println("Valor de C: ");
		valorC = entrada.nextInt();
		
		int[] numeros = new int[3];
		numeros[0] = valorA;
		numeros[1] = valorB;
		numeros[2] = valorC;
		
		Arrays.sort(numeros);
		
		for(int i = 2; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
		/*
		if(valorA > valorB && valorA > valorC && valorB > valorC) {
			System.out.println(valorA);
			System.out.println(valorB);
			System.out.println(valorC);
		} else if(valorA > valorB && valorC > valorB && valorA > valorC) {
			System.out.println(valorA);
			System.out.println(valorC);
			System.out.println(valorB);
		} else if() {
			
		}*/
	}
    
}
