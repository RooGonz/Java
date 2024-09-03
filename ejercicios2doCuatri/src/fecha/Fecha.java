package fecha;

public class Fecha {

	int dia;
	int mes;
	int anio;

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 2000;
	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public String toString() {
		return "" + this.dia + "/" + this.mes + "/" + this.anio;
	}

	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}

	public static boolean bisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0)
			return true;
		else if (anio % 400 == 0)
			return true;
		else
			return false;
	}
	
	public static int diasDelMes(int mes, int anio) {
		if(mes == 2) {
			if(bisiesto(anio)) {
				return 29;
			}
			return 28;
		}
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || 
				mes == 8 || mes == 10 || mes == 12) {
			return 31;
		}
		return 30;
	}
}
