
public class Orden_Burbuja {
	
	
	public void recibir(int[] arreglo,String[] arreglo_nom){
		
		int aux;
		String aux2;
		boolean cambios = false;
		
		
		while(true){
			cambios = false;
			
			for (int i = 1; i < arreglo.length; i++) {
				if(arreglo[i] < arreglo[i - 1]){
					
					aux=arreglo[i];
					arreglo[i]=arreglo[i-1];
					arreglo[i-1]=aux;
					
					aux2=arreglo_nom[i];
					arreglo_nom[i]=arreglo_nom[i-1];
					arreglo_nom[i-1]=aux2;
					
					cambios=true;
				}
				
			}
			
			if(cambios==false){
				break;
			}
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	public void recibir_nombres(String []arreglo_nombre){
		
	}

}