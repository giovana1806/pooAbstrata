package abstrataAnimal;

public class Principal {

	public static void main(String[] args) {
		Leao leao = new Leao("Alex", "Macho","Leao-Mdagascar");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		System.out.println("---------------------");
		Lobo lobo = new Lobo("Miguel", "Macho","Lobo guará");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		System.out.println("---------------------");
		Tigre tigre = new Tigre("Diego", "Macho","Dente de Sabre");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		System.out.println("---------------------");
		Gato gato = new Gato("Marie", "Femea", "Gato Branco");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		System.out.println("---------------------");
		Cachorro cachorro = new Cachorro("Dama", "Femea", "Cocker spaniel");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
	}

}
