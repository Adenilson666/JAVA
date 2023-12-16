import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtdNotaMaiorQue8 = 0;
		
		while(qtdNotaMaiorQue8 < 5) {
			System.out.println("Por favor, digita as notas");
			
			double nota = entrada.nextDouble();
			
			if(nota > 8) {
				qtdNotaMaiorQue8++;
			}
		}
	}
}
