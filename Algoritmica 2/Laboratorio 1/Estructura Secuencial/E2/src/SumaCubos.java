import java.util.Scanner;

public class SumaCubos {

	public static void main(String[] args) {
		
		int a, b=0, t=0;
		
		System.out.println("Ingrese la cantidad de numeros: ");
		Scanner S = new Scanner(System.in);
		a = S.nextInt();
		
		for(int i=1; i<=a; i++) {
			t = (int)(Math.pow(i, 3));
			b= b+t;
		}
		
		System.out.println("El resultado es: "+b);

	}

}
