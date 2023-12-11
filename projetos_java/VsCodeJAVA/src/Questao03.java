public class Questao03 {
    public static void main(String[] args) {
		//int i = 2400;
		
		for(int i=0; i<= 2401; i++) {
			if(i%4 == 0) {
				if(i%100 != 0 || i%400 == 0) {
					System.out.println(i+": Ano bissexto");
				} else {
					System.out.println(i+": Não bissexto");
				}
			}
			else {
				System.out.println(i+": Não bissexto");
			}
		}
	}
}
