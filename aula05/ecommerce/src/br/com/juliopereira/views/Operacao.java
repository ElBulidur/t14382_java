package br.com.juliopereira.views;

import java.math.BigDecimal;



@FunctionalInterface
public interface Operacao {
	
	BigDecimal efetua(BigDecimal num1, BigDecimal num2);
}


