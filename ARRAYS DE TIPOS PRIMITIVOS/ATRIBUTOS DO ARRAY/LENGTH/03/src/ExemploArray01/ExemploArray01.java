/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploArray01;

/**
 *
 * @author William
 */
public class ExemploArray01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago",
            "set", "out", "nov", "dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        
        for(int c = 0; c < mes.length; c++){
            System.out.println(" O mes de " + mes[c] + " tem " + tot[c] + " dias ao todo. " );
        }
    }
    
}
