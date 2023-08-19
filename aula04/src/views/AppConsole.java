package aula04.src.views;

import java.sql.Connection;


import aula04.src.application.controllers.FuncionarioController;
//import aula04.src.infra.databases.ConnectionMysql;

public class AppConsole {
    public static void main (String[] args){

        //var funcionario1 = new FuncionarioController();
        
        //funcionario1.cadastraFuncionario(
           // "Julio", "Instrutor", 200.00, true);

        //System.out.print(funcionario1.mostraSalario());

        // stack memory
        int x = 10;
        int y = x;

        //System.out.println(x); //10
        //System.out.println(y); //10

        y = 20;

        //System.out.println(x); //10
        //System.out.println(y); //20

        //System.out.println("=====");

        // heap space
        String[] arr = new String[5];
        arr[0] = "julio";

        String[] arr2 = new String[5];
        arr2 = arr;

        //System.out.println(arr[0]); //julio
        //System.out.println(arr2[0]); //julio

        arr2[0] = "Henrique";

        //System.out.println(arr[0]); //henrique
        //System.out.println(arr2[0]); //henrique

        //var conexao = new ConnectionMysql().getConnection();

        //System.out.println(conexao);

    }
}
