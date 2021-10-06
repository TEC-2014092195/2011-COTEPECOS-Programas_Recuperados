
public class Orden_Insert {

	
	
	public void ordenar(int [] array,String[] array_nom){
		int aux;
		int cont1;
		int cont2;
		String aux2;
		
		for (cont1 = 1; cont1 < array.length; cont1++) {
			aux=array[cont1];
			
			
			aux2 = array_nom[cont1];
			
			
			for (cont2 = cont1 - 1; cont2 >= 0 && array[cont2] > aux; cont2--) {
				
				array[cont2 + 1]=array[cont2];
				array[cont2] = aux;
				
				array_nom[cont2 + 1]=array_nom[cont2];
				array_nom[cont2] = aux2;
			}
		}
		
	}

}
