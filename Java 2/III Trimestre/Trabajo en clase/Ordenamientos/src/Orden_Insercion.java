
public class Orden_Insercion {

	
	public static void main(String[] args) {
		
		int[] arreglo = {9, 3, 25, 13, 1, 25, 7, 16, 15, 0, 1, 7, 2};
		
		
		Orden_Insercion orden = new Orden_Insercion();
		orden.Ordenar(arreglo);
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

	}
	
	public void Ordenar(int [] array){
		int aux;
		int cont1;
		int cont2;
		
		for (cont1 = 1; cont1 < array.length; cont1++) {
			aux=array[cont1];
			
			for (cont2 = cont1 - 1; cont2 >= 0 && array[cont2] > aux; cont2--) {
				
				array[cont2 + 1]=array[cont2];
				array[cont2] = aux;
			}
		}
		
	}

}
