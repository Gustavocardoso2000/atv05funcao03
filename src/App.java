//Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.
import java.util.Scanner;

class App {
	private static final String DIGITE_O_NUMERO_3 = "Digite o numero 3: ";

	public void sum(int number1, int number2, int number3) {
		System.out.println("A soma é: " + (number1 + number2 + number3));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		App e = new App();
		
		System.out.print("Digite o numero 1: ");
		int number1 = scan.nextInt();
		System.out.print("Digite o numero 2: ");
		int number2 = scan.nextInt();
		System.out.println(DIGITE_O_NUMERO_3);
		int number3 = scan.nextInt();		
		
		e.sum(number1, number2, number3);
	}
}

