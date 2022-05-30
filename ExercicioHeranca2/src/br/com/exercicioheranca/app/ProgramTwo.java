package br.com.exercicioheranca.app;

import br.com.exercicioheranca.entities.AbstractShape;
import br.com.exercicioheranca.entities.Circle;
import br.com.exercicioheranca.entities.Rectangle;
import br.com.exercicioheranca.entities.enums.Color;

public class ProgramTwo {

	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.BLUE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + s1.area());
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " +s2.area());
	}

}
