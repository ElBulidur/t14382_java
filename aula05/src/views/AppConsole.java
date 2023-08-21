package aula05.src.views;

import java.sql.Connection;


import aula05.src.application.controllers.FuncionarioController;
import aula05.src.infra.databases.mysqlDB;

public class AppConsole {
    public static void main (String[] args){

        var funcionario1 = new FuncionarioController();
        
        funcionario1.cadastraFuncionario(
           "Julio", "Instrutor", 200.00, true);

        System.out.print(funcionario1.mostraSalario());
    }
}
