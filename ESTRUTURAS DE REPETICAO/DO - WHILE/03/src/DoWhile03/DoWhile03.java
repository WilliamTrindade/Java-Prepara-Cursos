/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoWhile03;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class DoWhile03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Digite um numero"); 
            n = teclado.nextInt();
            s = s + n;
            System.out.print("Quer continuar");
            resp = teclado.next();
        }while("sim".equals(resp));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
