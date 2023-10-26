package atividInterfaceCalculos;

public class Principal {
	public static void main(String[] args) {
		Calculando calculo = new Calculando();
		System.out.println("SOMA:" + calculo.somar(10, 5));
		System.out.println("SUBTRAÇÃO:" + calculo.sub(10, 5));
		System.out.println("DIVISAO:" + calculo.div(10, 5));
		System.out.println("MULTIPLIÇÃO:" + calculo.mult(10, 5));
		System.out.println("EXPONENCIAL:" + calculo.exp(10, 5));
	}
	
}
