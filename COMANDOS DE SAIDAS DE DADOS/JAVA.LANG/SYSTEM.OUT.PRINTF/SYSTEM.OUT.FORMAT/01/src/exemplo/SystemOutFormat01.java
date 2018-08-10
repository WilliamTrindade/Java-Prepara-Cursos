/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;
public class SystemOutFormat01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota = 8.5f;
        //A sintaxe é igual ao System.out.printf(..)
        System.out.format("A nota é %.2f", nota);
    }
    
}
