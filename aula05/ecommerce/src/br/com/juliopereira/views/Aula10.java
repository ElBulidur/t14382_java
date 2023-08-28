package br.com.juliopereira.views;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Aula10 {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1,2,3,7,5,6,8,8,0,3);
		
		
		List<Integer> resposta= lista.stream()
		//.skip(5)
		//.limit(5)
		//.distinct()
		.filter(e -> e == 8)
		//.count();
		//.limit(1)
		.collect(Collectors.toList());

		for(Integer n = 0; n < lista.size();n++) {
			System.out.print(lista.get(n));
		}
		System.out.println("");
		
		for(Integer n: lista) {
			System.out.print(n);
		}
		System.out.println("");
		
		lista.forEach(n -> System.out.print(n));
		
		
		

	}

}
