/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Break01;

/**
 *
 * @author William
 */
public class numeroDivisivelPor19EntreXeY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 1000;
       for (int i = x; i < y; i++ ){
           if(i%19 == 0){
               System.out.println("Achei um número divisivel por 19 entre X e Y");
               System.out.println(i);
               break;
           }
       }
    }
    
}
