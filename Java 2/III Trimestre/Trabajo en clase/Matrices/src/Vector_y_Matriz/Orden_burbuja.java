package Vector_y_Matriz;

public class Orden_burbuja {
	int aux;
	boolean cambios = false;
	
	public void orden(int[][] b){
		while(true){
			cambios = false;
			for (int i = 1; i < b[1].length; i++) {
				if(b[1][i] < b[1][i - 1]){
					
					aux=b[1][i];
					b[1][i]=b[1][i-1];
					b[1][i-1]=aux;
					
					cambios=true;
				}
				
			}
			
			if(cambios==false){
				break;
			}
		}
	}

}
