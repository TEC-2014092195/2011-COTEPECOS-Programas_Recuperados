


public class Metodo_Burbuja  {

	
	public static void main(String[] args) {
		int[] arreglo = {9, 3, 25, 13, 1, 25, 7, 16, 15, 0, 1, 7, 2};
		
		Orden_Burbuja ordenar = new Orden_Burbuja();
		
		ordenar.recibir(arreglo);
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
			
		}
	}

}
