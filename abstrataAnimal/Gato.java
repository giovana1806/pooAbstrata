package abstrataAnimal;

public class Gato extends Animal {

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("O gato está dormindo");

	}

	@Override
	public void caminhar() {
		System.out.println("O gato está caminhando");
	}

	@Override
	public void correr() {
		System.out.println("O gato está correndo");

	}

	@Override
	public void emitirSom() {
		System.out.println("O gato está ronronando");

	}

}
