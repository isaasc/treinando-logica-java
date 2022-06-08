
public class Tabuada {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i);
			for (int y = 0; y <= 10; y++) {
				System.out.print(i + " x " + y + " = ");
				System.out.println(i * y);
			}
			System.out.println();	
		}
	}
}
