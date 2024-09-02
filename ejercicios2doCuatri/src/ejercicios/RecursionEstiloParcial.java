package ejercicios;

public class RecursionEstiloParcial {
	
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
		 
	 }
 // EJERCICIO 1
	 public static String tomarCaracteresDesde(String s,int desde, int cant) {
		 if (s.isEmpty()) {
			 return "";
		 }
		 if (cant == 0) {
			 return "";
		 }
		 if (desde > s.length()-1) {
			 return "";
		 }
		 else {
			 if (desde == 0) {
				 return s.charAt(desde) + tomarCaracteresDesde(resto(s), desde, cant-1);		 
		 }
			 else {
				 return tomarCaracteresDesde(resto(s), desde-1, cant);
		 }
	 }
	 }
//   EJERCICIO 2
//	 2- Escribir la función recursiva public static String insertarOrdenado(String s, char a) 
//	 que que toma un string s (cuyas letras se asumen ya en orden alfabético) y devuelve un string
//	 igual a s pero en el cual se ha insertado el char a , en la posición que corresponde de manera
//	 tal que el string siga estando ordenado. 
	 
	 //public static String insertarOrdenado(String s, char a)
	 
	 
//	 3- Escribir una función public static boolean comienzaCon(String s1, String s2) que dadas dos 
//	 cadenas s1 y s2 retorna verdadero si la cadena s2 comienza con la cadena s1, falso en caso
//	 contrario.
	 
	 //public static boolean comienzaCon(String s1, String s2)
	 
	 
//	 4- Escribir una funci´on recursiva public static String eliminarVocalesYRevertir(String s) 
//	 que toma un String s y devuelve una nueva cadena que resulta de eliminar de s todas las vocales
//	 y luego invertir sus caracteres.
	 
	 public static String eliminarVocalesYRevertir(String s) {
		 if ( s.isEmpty()) {
			 return s;
		 }
		 if (esvocal(s.charAt(0))) {
			 return eliminarVocalesYRevertir(resto(s));
		 }
		 else {
			 return eliminarVocalesYRevertir(resto(s)) + s.charAt(0);
		 }
	 }
	 private static boolean esvocal(char c) {
		 return c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ;
}
	 
//	 5- Escribir la función recursiva public static String alternaVocales(String s,String t)
//	 que devuelve la cadena que se obtiene al cambiar las vocales de la cadena s por las vocales
//	 de la cadena t a medida que van apareciendo de izquierda a derecha. Si hay menos vocales en
//	 t entonces las vocales de s que siguen no cambian.
	 
	 //public static String alternaVocales(String s,String t)
}
