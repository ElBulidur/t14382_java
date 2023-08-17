package aula03;

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
        return this.salario;
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
