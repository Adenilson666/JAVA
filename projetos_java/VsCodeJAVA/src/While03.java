import java.util.Random;

public class While03 {

	public static void main(String[] args) {
		int[] numerosSorteados = new int[6];
		boolean numeroJaSorteado;
		
		Random r = new Random();	

		for(int i=0; i<6; i++) {
			numeroJaSorteado = false;
			int numero = r.nextInt(60);
			
			if(numero == 0) {
				i--;
				continue;				
			}
			
			//System.out.println(numero);
			
			for(int j=0; j<6; j++) {
				if(numerosSorteados[j] == numero) {
					i--;
					numeroJaSorteado = true;
				}
			}
			
			if(numeroJaSorteado == false) {
				numerosSorteados[i] = numero;
			}
		}
		
		System.out.println("Numeros sorteados:");
		
		for (int i : numerosSorteados) {
			System.out.println(i);
		}
	}
}