package principal;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("Calculos matematicos");
		System.out.println("Somar 10 + 5: " + soma(10,5));
		System.out.println("Subtracao 10 - 5: " + sub(10,5));
	}
	
	public static int soma(int x, int b) {
		return x + b;
	}
	
	public static int sub(int x, int b) {
		return x - b;
	}

}
