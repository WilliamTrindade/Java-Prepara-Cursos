/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloigual01;

/**
 *
 * @author William
 */
public class ModuloIgual01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 18;
        idade %= 2; 
        //idade = idade%2;
        System.out.println("Resto da divisão de 18 pelo 2: " + idade);
    }
    
}
