package ejercicios;
//import RecursionFuncionesAux;

public class Main {

	public static void main(String[] args) {
		
		int [] s = {1, 9, 5, 5, 6, 7, 5};
		int [] p = {};
//		recursionConArray.imprimir(s);
//		recursionConArray.imprimir(p);
//		System.out.println(recursionConArray.suma(s));
		System.out.println(recursionConArray.estaOrdenado(s));
		System.out.println(recursionConArray.estaOrdenado(p));
		System.out.println(recursionConArray.cantidadApariciones(s, 0));
		System.out.println(recursionConArray.pertenece(s, 33));
		
//		String d = "programacion";
//		System.out.println(RecursionFuncionesAux.tomarCaracteresDesde(d,4,4));
//		System.out.println("5");
		
		
	}
	

}
