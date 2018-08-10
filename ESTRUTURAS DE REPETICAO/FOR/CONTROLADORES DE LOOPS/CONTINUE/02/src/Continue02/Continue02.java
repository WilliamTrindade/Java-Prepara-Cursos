/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Continue02;

/**
 *
 * @author William
 */
public class Continue02 {
    public static void main(String[] args) {
        for (int i =1; i <= 10; i++){
            //O loop é executado 10 vezes!
            if(i%2 == 0)
            continue;
            System.out.println(i + " é impar!");
            //Sera impresso  todos nueros impares de 1 a 10
            
        } 
    }
}
