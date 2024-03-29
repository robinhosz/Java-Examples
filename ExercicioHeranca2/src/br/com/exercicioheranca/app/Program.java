package br.com.exercicioheranca.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.exercicioheranca.entities.Circle;
import br.com.exercicioheranca.entities.Rectangle;
import br.com.exercicioheranca.entities.Shape;
import br.com.exercicioheranca.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Rectangle rec = new Rectangle(color, width, height);
				list.add(rec);
			} else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				Circle ci = new Circle(color, radius);
				list.add(ci);
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		sc.close();

	}

}
