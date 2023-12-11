import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
		int dia;

		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Digite um dia da semana de 1 a 7: ");
			dia = entrada.nextInt();
			
			switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Dia inválido");
			}
		} catch(Exception e) {
			System.out.println("Tipo de dado inválido!");
		}
	}
}