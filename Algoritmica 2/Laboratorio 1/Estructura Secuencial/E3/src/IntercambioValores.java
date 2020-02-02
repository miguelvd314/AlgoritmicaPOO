import java.util.Scanner;

public class IntercambioValores {
	
	public static void main(String[] args) {
		int a, b, c;
		
		System.out.println("Escriba el valor de a: ");
		Scanner S = new Scanner(System.in);
		a = S.nextInt();
		
		System.out.println("Escriba el valor de b: ");
		Scanner T = new Scanner(System.in);
		b = T.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("El nuevo valor de a es: "+a);
		System.out.println("El nuevo valor de b es: "+b);
	}
}
