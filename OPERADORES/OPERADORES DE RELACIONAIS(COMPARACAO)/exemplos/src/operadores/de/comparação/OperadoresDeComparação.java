/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores.de.comparação;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class OperadoresDeComparação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //< = menor que
        //> = maior que
        //<= = menor ou igual a
        //>= = maior ou igual a
        //== = igual a
        //!= = diferente de
        
        int idade = 17;
        boolean carteiraDeMotorista = false;
       
        if (idade >= 18 & carteiraDeMotorista == true){
           JOptionPane.showMessageDialog(null,"Voce Pode Dirigir");
        }
        else{
            JOptionPane.showMessageDialog(null,"Voce Não Pode Dirigir");
        }
        
    }
    
}
