package fecha;

public class Fecha {

	int dia;
	int mes;
	int anio;

	//constructor sin parametros
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 2000;
	}
	
	
//contructor con tres parametros
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	//método toString() transforma en string un objeto
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
	
	//1 Devuelve la cantidad de días del mes dado, en el año dado.
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
	
	//2 Devuelve true si la fecha es válida, y false en caso contrario.
	public boolean esValida() {
//		if (this.dia <= 0 || this.dia > 31) {
//			return false;
//		}
//		if (this.mes <= 0 || this.mes > 12) {
//			return false;
		}
		
	}
	
	//3 Hace avanzar un día a la fecha.
	public void avanzarDia() {
		
	}
	
	//4 Devuelve true si la fecha está antes que la fecha recibida como parámetro.
	public [static?] boolean antesQue(Fecha otra) {
		
		
	}
	
	//5 Devuelve el número del día en el año que representa la fecha (debe ser un número entre 1 y 366).
	 public [static?] int diaDelAño() {
		 
		 
	 }
	 
	 //6 Devuelve la cantidad de días de diferencia entre una fecha y la fecha recibida como parámetro.
	 public [static?] int diasDeDiferenciaCon(Fecha otra) {
		 
		 
	 }
}

