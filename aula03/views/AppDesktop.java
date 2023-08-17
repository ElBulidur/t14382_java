package aula03.views;

import aula03.Application.FuncionarioController;

public class AppDesktop {
   public static void main(String[] args) {
        var rogerio = new FuncionarioController();

        rogerio.cadastraFuncionario("Rogerio", "Develop", 50000.00, true);
        
        rogerio.aumentSalario(500);
        System.out.println("Salario com aumento: "+ rogerio.getSalario());

        //rogerio.aplicaDesconto(.20);
        //System.out.println("Salario com desconto: "+ rogerio.getSalario());
    }

}
