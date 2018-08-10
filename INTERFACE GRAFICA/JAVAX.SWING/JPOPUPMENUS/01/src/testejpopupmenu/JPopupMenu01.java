/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejpopupmenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author William
 */
public class JPopupMenu01 extends JFrame {
    private final JRadioButtonMenuItem itens[];
    private final Color cores[] = {
        Color.blue, Color.yellow, Color.red, Color.green, Color.orange
    };
    
    private JPopupMenu popupMenu;
    private final JPanel norte;
    private final JPanel sul;
    private final JPanel leste;
    private final JPanel oeste;
    private final JPanel centro;
    private int x = 0;
    private int y = 0;
    
    public JPopupMenu01(){
        super("Testando JPopupMenu");
        TratadorDeItem trat = new TratadorDeItem();
        String nomeDasCores[] = {
            "Azul", "Amarelo", "Vermelho", "Verde", "Laranja"
        };
        ButtonGroup umaCor = new ButtonGroup();
        popupMenu = new JPopupMenu();
        itens = new JRadioButtonMenuItem[5];
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        for(int count = 1; count < itens.length; count++){
            itens[count] = new JRadioButtonMenuItem(nomeDasCores[count]);
            popupMenu.add(itens[count]);
            umaCor.add(itens[count]);
            itens[count].addActionListener(trat);
        }
        
        norte = new JPanel();
        sul = new JPanel();
        leste = new JPanel();
        oeste = new JPanel();
        centro = new JPanel();
        container.add(norte, BorderLayout.NORTH);
        container.add(sul, BorderLayout.SOUTH);
        container.add(leste, BorderLayout.EAST);
        container.add(oeste, BorderLayout.WEST);
        container.add(centro, BorderLayout.CENTER);
        
        this.addMouseListener(
                new MouseAdapter(){
                    public void mousePerformed(MouseEvent evento){
                        verificaEventoDeDisparo(evento);
                    }
                    @Override
                    public void mouseReleased(MouseEvent evento){
                        verificaEventoDeDisparo(evento);
                    }
                    private void verificaEventoDeDisparo(MouseEvent evento){
                        x = evento.getX();
                        y = evento.getY();
                        if (evento.isPopupTrigger()){
                            popupMenu.show(evento.getComponent(), evento.getX(), evento.getY());
                        }
                    }
                }
        
        );
        
        setSize(800, 600);
        setVisible(true); 
    }
    public static void main(String[] args) {
        JPopupMenu01 aplicacao = new JPopupMenu01();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public Component estou(int valorX, int valorY){
        return findComponentAt(valorX, valorY);
    }
    private class TratadorDeItem implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            for(int i=0; i<itens.length; i++){
                if(evento.getSource()==itens[i]){
                    estou(x, y).setBackground(cores[i]);
                    repaint();
                    return;
                }
            }
        }
    }
}
