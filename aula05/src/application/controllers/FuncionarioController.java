package aula05.src.application.controllers;

import aula05.src.domain.entities.Funcionario;
import aula05.src.domain.repositories.FuncionarioRepository;

public class FuncionarioController {

    private Funcionario funcionario;
    private FuncionarioRepository repo;

    public FuncionarioController(){
        this.funcionario = new Funcionario();
        this.repo = new FuncionarioRepository();
    }

    public void cadastraFuncionario(
        String nome, String setor, double salario, boolean ativo){
            //this.funcionario =  new Funcionario(nome, setor, salario, ativo);

            repo.criar(nome, setor, salario, ativo);
            
            System.out.println("Cadastrado com sucesso!!!");

    }

        // aumenta o salario
    public void aumentSalario(double valor){
        if (valor > 0){
            double salario = funcionario.salario;
            salario += valor;
            funcionario.salario = salario;
        }
    }

    // desconta do salario
    public void aplicaDesconto(double desconto){
        //salario -= salario * desconto;
    }

    public double mostraSalario(){
        return funcionario.salario;
    }
    
}
