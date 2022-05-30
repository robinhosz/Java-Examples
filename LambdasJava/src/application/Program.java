package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Robson");
		list.add("Junior");
		list.add("Claudia");
		list.add("Mariza");
		list.add("Sonia");

		for (String l : list) {
			System.out.println(l);
		}

		System.out.println();

		// Usando lambda
		list.forEach(l -> System.out.println(l));

		Map<String, String> map = new HashMap<>();

		System.out.println();

		map.put("username", "Robson");
		map.put("email", "robson@gmail.com");
		map.put("idade", "19");

		for (String l : map.keySet()) {
			System.out.println(map.get(l));
		}

		System.out.println();

		map.forEach((i, l) -> {

			System.out.println(i + " " + l);
		});

	}

}
