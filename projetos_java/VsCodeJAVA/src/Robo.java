class Robo {
	//Atributos
	String nome;
	String cor;
	int velocidade;
	boolean status = false;
	
	
	//Métodos
	void acelerar() {
		this.velocidade += 5;
	}
	
	void imprimeNome() {
		System.out.println(this.nome);
	}
	
	boolean retornaStatus() {
		return status;
	}
	
	public void setNome(String nome) {
		if(nome.isBlank() || nome == "" || nome.length() < 3) {
			this.nome = "Robo sem nome";
		} else {
			this.nome = nome;			
		}
	}
	
	
	public static void main(String[] args) {
		Robo roboA = new Robo();
		roboA.setNome("Megazord");
		roboA.cor = "azul e vermelha";
		
		System.out.println(roboA);
		roboA.imprimeNome();
		System.out.println(roboA.cor);
		
		if(roboA.status == false) {
			roboA.status = true;
		}
		
		roboA.acelerar();
		roboA.acelerar();
		System.out.println(roboA.velocidade);
		
		Robo roboB = new Robo();
		roboB.setNome("Wall-e");
		roboB.cor = "branco";
		
		System.out.println();
		
		System.out.println(roboB);
		System.out.println(roboB.cor);
		System.out.println(roboB.nome);
		System.out.println(roboB.velocidade);
	}
}
