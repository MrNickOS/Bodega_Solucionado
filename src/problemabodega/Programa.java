package problemabodega;

public class Programa {
	
	static Bodega bodega;
	static Descargador procesoDescargador;
	static Empacador procesoEmpacador;
	
	public static void main(String[] args) throws InterruptedException {
		
		/*int i = 0;
		while (i<10) {
			System.out.println(new Random().nextInt(2)+1);
			i++;
			Thread.sleep(3000);
		}*/
		
		
		bodega = new Bodega();
		
		procesoDescargador = new Descargador(bodega);
		procesoEmpacador = new Empacador(bodega);
		
		procesoDescargador.start();
		procesoEmpacador.start();
	}

}
