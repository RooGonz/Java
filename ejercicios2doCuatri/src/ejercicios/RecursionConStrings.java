package ejercicios;

public class RecursionConStrings {
//0- Definir la función auxiliar String resto(String s) que devuelva toda la cadenas menos el 
//	primer caracter. No es necesario que sea recursiva.

	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
//1- Escribir una función recursiva llamada public static void imprimirEspaciado(String s) que 
//	tome un String e imprima el String con espacios entre cada caracter.
//Ejemplo:
//imprimirEspaciado(“Juan”)
//// imprime "J u a n"
//Hacer primero la función auxiliar resto(String s) que devuelva toda la cadenas menos el primer 
//	caracter.
//
	public static void imprimirEspaciado(String s) {
		if (s.isEmpty()) {
			System.out.println("");
		}
		System.out.print(s.charAt(0) + " " );
		imprimirEspaciado(resto(s));
	}
//2- Escribir una función  public static int longitud(String s) 
//Devuelve la longitud de la cadena s. No vale usar length(). 
//
	public static int longitud(String s) {
		if (s.isEmpty()) {
			return 0;
		}else {
			return 1 + longitud(resto(s));
		}
		
	}
//3- Escribir una función recursiva llamada public static String reverso(String s) que tomé un
//	String y devuelva el String que resulta de invertir todos sus caracteres.
//
	public static String reverso(String s) {
		if (s.isEmpty()) {
			return "";
		}
		else {
			return reverso(resto(s) + s.charAt(0));
		}
	}
//4- Escribir una función recursiva llamada  public static String combinar(String s, String t) que 
//	tome dos Strings y devuelva el String que resulta de comparar los strings caracter a caracter y
//	colocar el menor de ellos en el resultado. Si tienen longitudes distintas, tomamos el resto del 
//	string que quede.
//Ejemplo:
//String res = combinar(“abd”, "bbc")
////res vale "abc"
//String res = combinar(“fgd”, "adfxgtgs")
////res vale "addxgtgs"
//
	public static String combinar(String s, String t) {
		if (s.isEmpty()) {
			return t;
		}
		if (t.isEmpty()) {
			return s;
		}
		else {
			if (s.charAt(0) < t.charAt(0)) {
				return s.charAt(0) + combinar(resto(s), resto(t));
			}
			else {
				return t.charAt(0) + combinar(resto(s), resto(t));
			}
		}
	}
//5-Escribir una función que tome una cadena como parámetro y la imprima por consola intercalando 
//	un ’∗’ entre cada letra. Por ejemplo, si la función toma la cadena ”hola” como parámetro, deberá
//	imprimir ”h∗o∗l∗a”.
//
	public static void astericoEntreStr(String s) {
		if (s.isEmpty()) {
			System.out.println("");
		}
		System.out.print(s.charAt(0) + "*" );
		imprimirEspaciado(resto(s));
	}
//6- Implementar el método public static boolean esAbecedaria(String s) . Una palabra se dice que es
//	"abecedaria" si las letras en la palabra aparecen en orden alfabético o si la cadena está vacía 
//	o es de 1 caracter, se consindera "abecedaria". La función debe devolver un booleano.
//Por ejemplo, la siguientes son todas palabras abecedarias del castellano.
//adios, afín, año, ágil, bello, celos, cenó, chinos dijo, dimos, dios, fijos, finos, hijos,
//	hilos, himno

}
