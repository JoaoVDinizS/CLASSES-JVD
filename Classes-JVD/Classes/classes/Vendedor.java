package classes;

public class Vendedor extends Funcionario {
    private EquipeVenda equipe;
    private float salario;
    public EquipeVenda getEquipe() {
        return equipe;
    }
    public void setEquipe(EquipeVenda equipe) {
        this.equipe = equipe;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    }
