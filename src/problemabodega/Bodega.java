package problemabodega;

public class Bodega {
	
	static final int CAP_MAXIMA = 200;
	static final int VOL_TIPO_1 = 10;
	static final int VOL_TIPO_2 = 15;
	int capacidadActual;
	
	public Bodega() {
		capacidadActual = 0;
	}
	
	/*public int generarTipoAleatorio(){
		int tipoRandom = (int) (Math.random()*10);
		if(tipoRandom ==TIPO_1 || tipoRandom == TIPO_2){
			return tipoRandom;
		} else {
			return TIPO_1;
		}
	}*/
	
	public void descargarArticulo(int tipo) {
		if(tipo == 1){
			while (capacidadActual == CAP_MAXIMA - VOL_TIPO_1);
			capacidadActual += VOL_TIPO_1;
		} else if (tipo >= 2){
			while (capacidadActual == CAP_MAXIMA - VOL_TIPO_2);
			capacidadActual += VOL_TIPO_2;
		}
	}
	
	public boolean crearPaquete() {
		if(capacidadActual >= 90){
			int art_tipo1 = 3 * VOL_TIPO_1;
			int art_tipo2 = 4 * VOL_TIPO_2;
			capacidadActual -= (art_tipo1 + art_tipo2);
			System.out.println("Empaquetado terminado. Capacidad actual:"+capacidadActual+"\n");
			return true;
		} else {
			System.out.println("No se puede empaquetar aún. Espere a que se descarguen "
					+ "más artículos.\n");
			return false;
		}
	}
}