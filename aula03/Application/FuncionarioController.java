package aula03.Application;

import aula03.Domain.entities.Funcionario;

public class FuncionarioController {

    private Funcionario funcionario = new Funcionario();

    public FuncionarioController(){
        
    }

    public void cadastraFuncionario(
        String nome, String setor, double salario, boolean ativo){
            
            this.funcionario =  new Funcionario(nome, setor, salario, ativo);
    }

        // aumenta o salario
    public void aumentSalario(double valor){
        if (valor > 0){
            //salario += valor;
            var salario = funcionario.getSalario();
            salario += valor;
            funcionario.setSalario(salario);
        }
    }

    // desconta do salario
    public void aplicaDesconto(double desconto){
        //salario -= salario * desconto;
    }

    public double getSalario(){
        return funcionario.getSalario();
    }
    
}
