/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Continue01;

/**
 *
 * @author William
 */
public class Continue01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            if(i > 50 && i < 60){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
