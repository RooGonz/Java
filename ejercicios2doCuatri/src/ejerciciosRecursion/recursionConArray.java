package ejerciciosRecursion;

public class recursionConArray {
	
//EJERCIO 1
//Imprime por pantalla los elementos del arreglo.
	
	public static void imprimir(int[] a) {
		System.out.println(imprimirEnRango(a,0));
	}
	public static String imprimirEnRango (int[] a, int i) {
		if (i == a.length) {
			return "";
		}
		else {
			return a[i] + " " + imprimirEnRango(a, i+1);
		}
	}
	
//EJERCICIO 2
//Hacer una función recursiva que sume los elementos de un arreglo
//necesita una funcion auxiliar recursiva
	
	public static int suma(int[] a) {
		return sumaEnRango(a,0);
	}
	public static int sumaEnRango (int[] a, int i) {
		if (i == a.length) {
			return 0;
		}
		else {
			return a[i] + sumaEnRango(a, i+1);
		}
	}
	
//EJERCICIO 3
//que dado un arreglo de enteros, devuelve verdadero si el arreglo está ordenado
//crecientemente de menor a mayor, y falso en caso contrario.
	
	public static boolean estaOrdenado(int[] a) {
		return check(a,0);
		
	}
	public static boolean check(int[]a, int indice) {
		if (indice == a.length) {
			return true;
		}
		if (a[indice] > a[indice+1]) {
			return false;
		}
		return check(a,indice+1);
	}
	
//EJERCICIO 4
//que dado un arreglo de enteros y un entero, cuenta la cantidad de veces que 
//aparece n en a.
	
	public static int cantidadApariciones(int[] a, int n) {
		return cantAparicionesRecursivo(a, n, 0);
	}
	public static int cantAparicionesRecursivo(int[] a, int n, int indice) {
		if (indice == a.length) {
			return 0;
		}
		int cont = 0;
		if (a[indice] == n) {
			cont = 1;
		}else {
			cont = 0;
		}
		return cont + cantAparicionesRecursivo(a, n, indice + 1);
	}
	
//EJERCICIO 5
//ver si n pertenece al arreglo a
	
	public static boolean pertenece(int[] a, int n) {
		return estar(a, n, 0);
	}
	
	public static boolean estar(int[] a, int n, int indice) {
		if (indice == a.length) {
			return false;
		}
		if (a[indice] == n) {
			return true;
		}
		else {
			return estar(a, n, indice + 1);
		}
	}

}
