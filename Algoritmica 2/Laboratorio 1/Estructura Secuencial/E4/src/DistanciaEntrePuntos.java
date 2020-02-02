
public class DistanciaEntrePuntos {

	public static void main(String[] args) {
		int a, b, c, d, total;
		
		a=2;
		b=5;
		c=5;
		d=9;
		
		total = (int)(Math.pow(c-a, 2)) + (int)(Math.pow(d-b, 2));
		total=(int)(Math.sqrt(total));
		
		System.out.println("La distancia entre los puntos es: "+total);

	}

}
