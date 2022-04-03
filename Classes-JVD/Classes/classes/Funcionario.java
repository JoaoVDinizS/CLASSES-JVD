package classes;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate nascimento;
    private String CPF;
    private Endereco enderecos;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public Endereco getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(Endereco enderecos) {
        this.enderecos = enderecos;
    }
    
   

    
}