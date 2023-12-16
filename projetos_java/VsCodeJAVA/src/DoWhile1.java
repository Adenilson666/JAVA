import java.util.Random;
import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		Random r = new Random();
		int numero = r.nextInt(60);
		
		Scanner entrada = new Scanner(System.in);
		
		
		boolean acertou;
		
		do {
			int chute = entrada.nextInt();
			
			if(chute == numero) {
				acertou = true;				
			} else {
				acertou = false;
			}
			
		} while(!acertou);
	}
}