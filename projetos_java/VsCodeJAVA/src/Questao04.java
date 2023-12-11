public class Questao04 {
    public static void main(String[] args) {
		double ladoA = 5;
		double ladoB = 7;
		double ladoC = 8;
		
		if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
			System.out.println("É um triângulo!");
			
			if(ladoA==ladoB && ladoA==ladoC) {
				System.out.println("Tipo: equilátero");
			} else if(ladoA==ladoB || ladoA==ladoC || ladoB==ladoC) {
				System.out.println("Tipo: isósceles");
			} else {
				System.out.println("Tipo: escaleno");
			}
			
		} else {
			System.out.println("Não é um triângulo!");
		}
	}
}
