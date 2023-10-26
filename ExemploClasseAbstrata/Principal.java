package ExemploClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
		Carro ferrari = new Carro("GSB-1806","F1", "vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		System.out.println("---------------------------");
		Onibus marcopolo = new Onibus("YFP-1707","F1", "vermelho", 2023);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
	}

}
