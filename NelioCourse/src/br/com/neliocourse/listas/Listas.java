package br.com.neliocourse.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Robson");
		list.add("Claudia");
		list.add("Junior");
		list.add("Sonia");
		list.add(2, "Mariza");

		System.out.println(list.size());

		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("--------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("--------------");
		System.out.println("Index of Junior: " + list.indexOf("Junior"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("--------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		for (String nomes : result) {
			System.out.println(nomes);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(name);
	}

}
