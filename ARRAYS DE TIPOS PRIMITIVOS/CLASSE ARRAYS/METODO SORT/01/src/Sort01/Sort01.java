/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort01;

import java.util.Arrays;

/**
 *
 * @author William
 */
public class Sort01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5};
        //organiza os arrays
        Arrays.sort(v);
        
        for (double valor : v){
            System.out.println(valor + " ");
        }
    }
    
}
