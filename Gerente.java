/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula;

/**
 *
 * @author eduar
 */
public class Gerente extends Funcionario {
    private int nFuncionarios;

    

         public Gerente(String nome, float salario, int nFuncionarios){
            super(nome, salario); 
            this.nFuncionarios = nFuncionarios;
        }

         public void mostrarInfo(){
             super.mostrarInfo();
             System.out.println("Nº Funcionarios: " + nFuncionarios);
         }
         
         
         public void aumentarSal(float perc){
             super.AumentarSal(20+perc);
         }
         
         public void aumentaFuncionario(){
             nFuncionarios++;
         }
         
         
      
         
}
