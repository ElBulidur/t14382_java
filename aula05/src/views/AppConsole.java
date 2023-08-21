package aula05.src.views;

import java.sql.Connection;


import aula05.src.application.controllers.FuncionarioController;

public class AppConsole {
    public static void main (String[] args){

        var funcionario1 = new FuncionarioController();
        
        funcionario1
        .cadastraFuncionario("Julio", "Instrutor", 200.00, true);
    }
}
