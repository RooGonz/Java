package objetos;

import java.awt.Point;
import java.awt.Rectangle;

public class Objeto {
	
//	1. double distancia(Point p1, Point p2)
//	El método debe devolver la distancia entre los puntos dados.
	
	public static double distancia(Point p1, Point p2) {
		int ancho=p2.x - p1.x;
		int alto=p2.y - p1.y;
		return Math.sqrt((ancho)*(ancho) + (alto)*(alto));
	}
	
//	2. double diagonal(Rectangle r)
//	El método debe devolver la medida de la diagonal del rectángulo pasado como parámetro. 
//	Usar el método "distancia" del punto anterior sobre determinados puntos del rectángulo.
	
	public static double diagonal(Rectangle r) {
		Point supIzq = new Point(r.x, r.y);
		Point infDer = new Point(r.x + r.width, r.y + r.height);
		
		return distancia(infDer, supIzq);
		
	}
	
//	3. Point centro(Rectangle r)
//	  El método debe devolver el punto central del rectangulo r.
	
	public static Point centro(Rectangle r) {
		Point centro = new Point ((r.x + r.width)/2, (r.y + r.height)/2);
		
		return centro;
	}
	
	
//4. boolean estaDentro(Point p, Rectangle r)
	
	public static boolean estaDentro(Point p, Rectangle r) {
		
		if(p.x>= r.x && p.x <= r.x+r.width) {
			if(p.y >= r.y && p.y <= r.y+r.height) {
				return true;
			}
		}
		return false;
	}
	
	
//	5. Point puntoMedio(Point p1, Point p2)
//	  El método devuelve un nuevo punto, que se encuentra en el medio del segmento que une
//	a p1 con p2. Matemáticamente, este punto tiene como coordenada x el promedio de las coordenadas
//	x de los dos puntos y lo mismo para la coordenada y.
//
	public static Point puntoMedio(Point p1, Point p2) {
		Point puntoMedio = new Point ((p1.x + p2.x)/2, (p1.y + p2.y)/2);
		
		return puntoMedio;
	}
	
//	6. Rectangle encuadrar(Rectangle r1, Rectangle r2)
//	  El método debe devolver el rectángulo más pequeño que contenga a los dos rectángulos dados.
	
	public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {	
		int x;
		int y;
		int ancho = 0; // falta calcular
		int alto = 0;	// falta calcular
		//valor de x
		if(r1.x<=r2.x) {
			x=r1.x;
		}else {
			x=r2.x;
		}
		//valor de y
		if(r1.y<=r2.y) {
			y=r1.y;
		}else {
			y=r2.y;
		}
		//valor de ancho (width)
		if(r1.x+r1.width >= r2.x+r2.width) {
			ancho = r1.x + r1.width;
		}else {
			ancho = r2.x + r2.width;
		}
		//valor de alto (height)
		if(r1.x+r1.height >= r2.x+r2.height) {
			ancho = r1.x + r1.height;
		}else {
			ancho = r2.x + r2.height;
		}
		
		return new Rectangle(x,y,ancho,alto);
	}
//	7. boolean estaContenido(Rectangle r1, Rectangle r2)
//	  El método debe indicar si el rectangulo r1 está contenido completamente dentro del rectángulo r2.
//
	public static boolean estaContenido(Rectangle r1, Rectangle r2) {
		//Verificar si el lado izquierdo de r1 está dentro de r2
		if(r1.x>= r2.x) {
			// Verificar si el lado derecho de r1 está dentro de r2
			if (r1.x+r1.width <= r2.x+r2.width) {
				//Verificar si el lado superior de r1 está dentro de r2
				if(r1.y >= r2.y) {
					//Verificar si el lado inferior de r1 está dentro de r2
					if (r1.y + r1.height <= r2.y + r2.height) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
//	8. (dificil!)
//	Rectangle interseccion(Rectangle r1, Rectangle r2)
//	El método debe devolver el rectángulo contenido en ambos rectángulos r1 y r2. En caso de que
//	no se intersequen debe devolver null.
	
	public static Rectangle interseccion(Rectangle r1, Rectangle r2) {
		int x;
		int y;
		int ancho = 0;
		int alto = 0;	
		
		if (r1.x > r2.x) {
			x=r1.x;
		}else {
			x=r2.x;
		}
		if (r1.y > r2.y) {
			y=r1.y;
		}else {
			y=r2.y;
		}
		if (r1.x + r1.width < r2.x + r2.width) {
			ancho = r1.x + r1.width;
		}else {
			ancho = r2.x + r2.width;
		}
		if (r1.y + r1.height < r2.y + r2.height) {
			alto = r1.y + r1.height;
		}else {
			alto = r2.y + r2.height;
		}
		//si hay interseccion se crea un rectangle con los datos obtenidos
		if (x < ancho && y < alto) {
			return new Rectangle(x, y, ancho - x, alto - y);
		}else {
			return null; //si NO hay interseccion devuelve NULL
		}
	}
	
	
}
