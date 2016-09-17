package problemabodega;

import java.util.Random;

public class Empacador extends Thread {
	
	Bodega bodega;
	
	public Empacador(Bodega laBodega) {
		bodega = laBodega;
	}
	
	public void run() {
		while(true) {
			Random random = new Random();
			System.out.println("Comenzando el empaquetado ...\n");
			int tEmpaque = random.nextInt(20);
			System.out.println("Tiempo de empaquetado: "+tEmpaque+" segundos");
			try {
				sleep(tEmpaque*1000);
			} catch (Exception e) {
				// Do nothing
			}
			bodega.crearPaquete();
		}
	}
}
