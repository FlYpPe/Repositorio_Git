import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class NumeroControl{
	
	public void archivoCrear() {

		String ruta1 = "./src/NumerosDeControl.txt";
		File archivo = new File(ruta1);

		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

		}
	}
	public String generarNumero() {

		int con = 0;
		for (int i = 70000; i < 75000; i++) {
			Random rand = new Random();
			con = rand.nextInt(18075000-18069999)+18069999;
		}
		String numero = con+"";
		return numero;
	}
	public String letraPorCarrera(String numControl) {

		String letra = "#";

		String n = numControl+"";
		String num = n.substring(2, 5);

		if (num.equals("070")) {
			letra = "S";
		} else if (num.equals("071")) {
			letra = "M";
		} else if (num.equals("072")) {
			letra = "I";
		} else if (num.equals("073")) {
			letra = "A";
		} else if (num.equals("074")) {
			letra = "C";
		}

		String numControlCom = letra+numControl;

		return numControlCom;
	}
	public void guardarNumeroControl() {
		
		FileWriter archivo = null;
		PrintWriter pr = null;
		
		try {
			archivo = new FileWriter("./src/NumeroDeControl.txt", true);
			pr = new PrintWriter(archivo);
			
			String numeroControl = "";
			
			for (int i = 70000; i < 75000; i++) {
				String num = this.generarNumero();
				numeroControl = this.letraPorCarrera(num);
				pr.println(numeroControl);
				System.out.println(numeroControl);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			pr.close();
		}
	}
}

public class GeneradorNumerosDeControl{

	public static void main(String[] args) {
		NumeroControl n = new NumeroControl();
		n.archivoCrear();
		n.guardarNumeroControl();

	}

}
