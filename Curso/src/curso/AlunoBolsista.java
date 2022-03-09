/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author alexr
 */
public class AlunoBolsista extends Aluno{
    private double desconto;
    
    public AlunoBolsista(double m, double d){
        super(m);
        this.desconto = d;
    }
    
    public AlunoBolsista(int c, String n, double d){
        super(c, n);
        this.desconto = d;
    }
    
    public double getMensalidade (){
      return getMensalidade() - this.desconto;
   }
   
   public void imprimir(){       
       System.out.println("nome: " + getNome());
       System.out.println("cod: " + getCodMatricula());
       System.out.println("desconto: " + this.desconto);
   }
    
}
