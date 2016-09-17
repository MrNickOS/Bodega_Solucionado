package problemabodega;

import java.util.Random;

public class Descargador extends Thread {
	
	Bodega bodega;
	
	public Descargador(Bodega laBodega){
		bodega = laBodega;
	}
	
	public void run(){
		while (true) {
			Random tiempoRandom = new Random();
			int tipoRandom = new Random().nextInt(2)+1;
			System.err.println("Material recibido: Artículo tipo "+tipoRandom+"\n");
			int tdescarga = tiempoRandom.nextInt(20);
			System.err.println("Tiempo de descarga: "+tdescarga+" segundos\n");
			try {
				sleep(tdescarga*1000);
			} catch (InterruptedException e) {
				// Do nothing
			}
			bodega.descargarArticulo(tipoRandom);
			System.err.println("Artículo descargado.\n");
			System.err.println("Capacidad actual de la bodega: "+bodega.capacidadActual);
		}
	}

}
