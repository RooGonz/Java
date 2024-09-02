package ejercicios.objetos.src.objetos;

//import java.awt.Point;

import java.awt.Point;
import java.awt.Rectangle;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,1);
		
		//System.out.println(Objeto.distancia(p1, p2));
		
		Rectangle r2 = new Rectangle(0,0,5,6);
		Rectangle r1 = new Rectangle(4,0,23,13);
		Point p3 = new Point(1,2);
		//System.out.println(Objeto.estaDentro(p3, r1));
		
		//System.out.println("es centro del rectangulo " + r1 + "es: " + Objeto.centro(r1));
		//System.out.println(Objeto.puntoMedio(p1, p2));
		System.out.println(Objeto.interseccion(r1, r2));
	

	}

}
