import java.util.ArrayList;
import java.util.*;

public class SubListaThread implements Runnable {
	int sumLocal = 0;
	int ini;
	int fin;
	List<Integer> arreglo = new ArrayList();
	
	public SubListaThread(List<Integer> arreglo, int ini, int fin) {
		
	}
	
	public int getSumLocal() {
		return sumLocal;
		
	}
	
	
	
	public void makeLocalSum() {
		int s = 0;
		for(int i = ini; i <fin ; i++) {
			s+=arreglo.get(i);
		}
	}

	@Override
	public void run() {
		makeLocalSum();		
	}
	
}
