import java.util.Scanner;

public class ConvertirSexagesimal {

	public static void main(String[] args) {
		double a, x, y, z, pi=3.1415;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Ingrese un angulo en radianes: ");
		a = S.nextInt();
		
		x = a*180/pi;
		y = x-(int)(x);
		y = y*60;
		z = y-(int)(y);
		z = z*60;
		
		System.out.println("El resultado es: "+(int)(x)+"° "+(int)(y)+"´ "+(int)(z)+"´´");

	}

}
