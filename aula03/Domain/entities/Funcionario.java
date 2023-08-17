package aula03.Domain.entities;

public class Funcionario {
    // Atributos
    private int id;
    private String nome;
    private String setor;
    private double salario;
    private boolean ativo;

    //CONSTRUTOR PATRAO
    public Funcionario(){
        
    }

    public Funcionario(String nome, String setor,
    double salario, boolean ativo){
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
        this.ativo = ativo;
    }

    // getter e setters
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
    

    public void setSetor(String setor){
        this.setor = setor;
    }

    public String getSetor(){
        return this.setor;
    }
    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public boolean getAtivo(){
        return this.ativo;
    }

}
