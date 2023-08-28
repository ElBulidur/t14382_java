package br.com.juliopereira.views;

import java.math.BigDecimal;
import java.util.List;

public class AppCalculadora {

	public static void main(String[] args) {
		Operacao operacao[] = {
				new Calculadora().new Adicao(),
				new Calculadora().new Subtracao(),
				new Calculadora().new Divisao(),
				new Calculadora().new Multiplicacao()
	};
		
		BigDecimal num3 =new BigDecimal(10);
		BigDecimal num4 = new BigDecimal(2);

		//for(Operacao op : operacao) {
			//System.out.println(Calculadora.calcula(num1, num2, op));
		//}

		//Operacao subtracao = (num1, num2) -> num2;
		//Operacao divisao = (num1, num2) -> num1.add(num2);
		//Operacao multiplicacao = (num1, num2) -> num1.add(num2);
		
		Test test = (x, y, z) -> { return x + y + z; };
		
		//System.out.println(Calculadora.calcula(num3, num4, subtracao));
		//System.out.println(Calculadora.calcula(num3, num4, divisao));
		//System.out.println(Calculadora.calcula(num3, num4, multiplicacao));
	}

}
