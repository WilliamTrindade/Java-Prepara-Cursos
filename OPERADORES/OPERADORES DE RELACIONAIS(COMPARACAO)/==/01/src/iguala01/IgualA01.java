/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iguala01;

/**
 *
 * @author William
 */
public class IgualA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 17;
        
        if (idade == 17){
            System.out.println("Você deve se alistar ao serviço militar!");
        }else if(idade > 17){
            System.out.println("Se ainda não se alistou regularize sua situação!");
        }else{
            System.out.println("Você ainda não está em época de alistamento!");
        }
    }
    
}
