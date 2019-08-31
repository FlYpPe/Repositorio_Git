class TDACadenaEspecialConString {
	private String cadena;

	public TDACadenaEspecialConString(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return this.cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	// operaciones

	public String invertircadenaPorletra() {
		String cadInv = "";
		for (int i = this.cadena.length() - 1; i >= 0; i--) {
			cadInv = cadInv + cadena.substring(i, i + 1);
		}
		return cadInv;
	}

	public String invertirCadenaPorPalabras() {
		String cadInv = "";
		String[] caden = this.cadena.split(" ");
		for (int i = caden.length - 1; i >= 0; i--) {
			cadInv = cadInv + caden[i] + " ";
		}
		return cadInv;
	}

	public String agregarOEliminarCaracter(char car, int pos) {
		String cadNuev = "";
		for (int i = 0; i < this.cadena.length(); i++) {
			if (i == pos) {
				cadNuev = cadNuev + car;
			}
			cadNuev = cadNuev + this.cadena.substring(i, i + 1);

		}

		return cadNuev;
	}
	
	public String agregarCadenaEnPosicion(String cad, int pos) {
		
		String cadNuev = "";
		String []caden = this.cadena.split(" ");
		for (int i = 0; i < caden.length; i++) {
			if (i == pos)
				cadNuev = cadNuev + cad;
			cadNuev = cadNuev + caden[i];
			
		}
		
		return cadNuev;
	}
	
}

public class PruebaManipulacionCadena {

	public static void main(String[] args) {

		TDACadenaEspecialConString TDA1 = new TDACadenaEspecialConString("Perro");

		String a = TDA1.invertircadenaPorletra();
		System.out.println(a);
		TDA1.setCadena("Buenos dias shavales");
		a = TDA1.invertirCadenaPorPalabras();
		System.out.println(a);
		TDA1.setCadena("Castor");
		a = TDA1.agregarOEliminarCaracter('m', 2);
		System.out.println(a);
	}

}
