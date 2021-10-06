/**
 * Kevin Hernandez Rostran 
 * 11-4
 * COTEPECOS
 * 16/09/2012
 */
package Tiempo;

public class Conversiones {
	private double ingreso;
	private int horas=0;
	private int minutos;
	private int segundos;
	private double x=0,xmin=0,xseg=0;
	
	
	public Conversiones(){
		
	}
	
	public void asig_horas(double ingreso){
		this.ingreso=ingreso;
		this.horas=(int)ingreso;
		
	}
	
	public void asig_minutos(double ingreso){
		this.ingreso=ingreso;
		this.minutos=(int)ingreso;
	}
	
	public void asig_segundos(double ingreso){
		this.ingreso=ingreso;
		this.segundos=(int)ingreso;
	}
	
	public int obt_horas(){
		if(horas!=0){
			x = ingreso - horas;
			return horas;
		}else if(minutos >= 60){
				xmin = ingreso/60;
				horas = (int) xmin;
				xmin-=horas;
				xmin*=60;
				return horas;
		}else if(segundos>=3600){
			xseg = ingreso / 3600;
			horas = (int) xseg;
			xseg-=horas;
			xseg*=60;
			return horas;
		}else	
			return horas;
		
	}
	
	
	
	
	
	public int obt_minutos(){
		if(x!=0){
			x*=60;
			minutos=(int)x;
			x = x - minutos;
			x*=60;
			return minutos;
		}else if(xmin != 0){
				minutos = (int) xmin;
				xmin -= minutos;
				xmin*=60;
				return minutos;
			}else if (xseg!=0){
				minutos = (int) xseg;
				xseg -= minutos;
				xseg*=60;
				return minutos;
			}else{
			x = ingreso - minutos;
			return minutos;
			}
	}
	
	
	
	
	
	public int obt_segundos(){
		if(x!=0){
			
			segundos = (int) x;
			return segundos;
		}else if(xmin !=0 ){
			segundos = (int) xmin;
			return segundos;
		}else if(xseg!=0){
			segundos = (int) xseg;
			 return segundos;
		}else
			return segundos;
	}
}
