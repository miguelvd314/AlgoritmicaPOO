import java.util.Scanner;

public class EjercicioMat {

	public static void main(String[] args) {
		int a, b, total;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Ingrese su dia y mes de nacimiento: ");
		a = S.nextInt();
		Scanner T = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		b = T.nextInt();
		
		total = (a*2+5)*50+b+365-615;
		
		System.out.println("El resultado es: "+total);

	}

}
