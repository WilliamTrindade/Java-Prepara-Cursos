/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author William
 */
import model.Mostra;
import javax.swing.*;
import javax.swing.JOptionPane;

public class HoraUniversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hr, ms, ss;
        int h, m, s;
        hr = JOptionPane.showInputDialog("Entre com a hora");
        ms = JOptionPane.showInputDialog("Entre com os minutos");
        ss = JOptionPane.showInputDialog("Entre com os segundos");
        
        h= Integer.parseInt(hr);
        m= Integer.parseInt(ms);
        s= Integer.parseInt(ss);
        
        Mostra t = new Mostra();
        t.setTempo(h, m, s);
        
        String saida = "Horario universal é :" + t.horaUniversal();
        
        JOptionPane.showMessageDialog(null, saida, "Teste Saida", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
