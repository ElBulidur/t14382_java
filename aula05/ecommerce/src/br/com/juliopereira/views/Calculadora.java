package br.com.juliopereira.views;

import java.math.BigDecimal;

public class Calculadora {
	
	static public BigDecimal calcula(BigDecimal num1, BigDecimal num2, Operacao operacao) {
		return operacao.efetua(num1, num2);
	}
	
	
	public class Adicao implements Operacao{

		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			
			return num1.add(num2);
		}
	}
	
	public class Subtracao implements Operacao{

		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			// TODO Auto-generated method stub
			return num1.subtract(num2);
		}
		
	}
	
	public class Divisao implements Operacao{

		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			// TODO Auto-generated method stub
			return num1.divide(num2);
		}
		
	}
	
	public class Multiplicacao implements Operacao{

		@Override
		public BigDecimal efetua(BigDecimal num1, BigDecimal num2) {
			// TODO Auto-generated method stub
			return num1.multiply(num2);
		}
	}

}
