import java.io.*;


public class ArchivoTextoPlano {
	private File f;
	
	public void crearArchivo(){
		try {
			f = new File("G:\\Archivos\\Texto_plano_kevin.txt");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void escribirArchivo(){
		
		try {
			
			FileWriter fw = new FileWriter(f);
			
			fw.write("Hola Gente \n Me gusta programar \n No se duerman \n Dios los Bendiga");
			fw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void leerArchivo(){
		
		try {
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = null;
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			br.close();
			fr.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
