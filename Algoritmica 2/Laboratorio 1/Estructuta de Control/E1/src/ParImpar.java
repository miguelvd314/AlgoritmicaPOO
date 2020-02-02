import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int num;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Digite un numero: ");
		num =  S.nextInt();
		
		if(num%2 == 0) {
			System.out.println("El numero es par.");
		}else {
			System.out.println("El numero es impar.");
		}

	}

}
