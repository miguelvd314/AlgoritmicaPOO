import java.util.*;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int t = 10;
		
		List<Integer>arreglo = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			arreglo.add(i+1);
		}
		SubListaThread sbt;
		int sfinal = 0;
		for(int i = 0; i < t; i++) {
			sbt = new SubListaThread(arreglo, i*(100/t), (i+1)*100/t);
			Thread t1 = new Thread(sbt);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sfinal +=sbt.getSumLocal();
									
		}
		System.out.println(sfinal);
		
		sfinal = 0;
		for(int i = 0; i < 100; i++) {
			sfinal+=arreglo.get(i);
		}
		System.out.println(sfinal);		
	}
}	
