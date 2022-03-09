/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author alexr
 */
public class Aluno {

    private int codMatricula;
    private String nome;
    private double mensalidade;

    public Aluno() {
    }

    public Aluno(double m) {
        this.mensalidade = m;
    }
    
    public Aluno(int c, String n) {
        this.codMatricula = c;
        this.nome = n;
    }

    /**
     * @return the codMatricula
     */
    public int getCodMatricula() {
        return codMatricula;
    }

    /**
     * @param codMatricula the codMatricula to set
     */
    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("nome: " + this.nome);
        System.out.println("cod: " + this.codMatricula);
    }

    /**
     * @return the mensalidade
     */
    public double getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
