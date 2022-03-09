/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso;

/**
 *
 * @author alexr
 */
public class Curso {

    public static void main(String[] args) {
        // TODO code application logic here
        Aluno x = new Aluno(25, "Matheus Paulo");
        AlunoBolsista z = new AlunoBolsista(25, "Matheus Paulo", 700);
        
        Aluno j = new Aluno();
        j.setCodMatricula(23);
        j.setNome("Alex Rese");
        
        Aluno p = new Aluno();
        p.setCodMatricula(24);
        p.setNome("João Pedro");        
        
        z.imprimir();
        p.imprimir();
        x.imprimir();
        j.imprimir();
    }
    
}
