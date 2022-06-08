import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroFatorial;
		System.out.print("Informe um número e descubra seu fatorial: ");
		numeroFatorial = teclado.nextInt();

		int resultado = 1;
		for (int i = 1; i <= numeroFatorial; i++) {
			resultado *= i;
		}
		System.out.println("Fatorial de " + numeroFatorial + " = " + resultado);

		teclado.close();
	}

}
