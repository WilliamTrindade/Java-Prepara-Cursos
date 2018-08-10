/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ouexcluisivo01;

/**
 *
 * @author William
 */
public class OuExcluisivo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        //Uma ou exclusicvamente outra tem que ser true
        boolean r = (x<y ^ y==z);
        System.out.println(r);
    }
}
