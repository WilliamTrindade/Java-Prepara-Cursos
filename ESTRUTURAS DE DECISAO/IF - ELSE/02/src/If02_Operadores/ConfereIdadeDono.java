/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If02_Operadores;

/**
 *
 * @author William
 */
public class ConfereIdadeDono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int idade = 15;
       boolean amigoDoDono = true;
       //if (idade < 18 & amigoDoDono == fase){
       if (idade < 18 & ! amigoDoDono){
           System.out.println("Pode entrar");
       }   
       else{
           System.out.println("Não pode entrar");
       }
    }
}