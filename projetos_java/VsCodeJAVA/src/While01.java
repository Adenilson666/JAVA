import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			System.out.println("Teste:");
			
			int valor = entrada.nextInt();
			
			if(valor > 10) {
				System.out.println("Continuar...");
			} else {
				break;
			}
		}
	}
}