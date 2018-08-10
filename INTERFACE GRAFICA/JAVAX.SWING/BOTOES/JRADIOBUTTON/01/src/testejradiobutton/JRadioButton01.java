package testejradiobutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author William
 */
public class JRadioButton01 extends JFrame {
    //componentes
    private final JTextField campo;
    private final JRadioButton amarelo;
    private final JRadioButton vermelho;
    private final JRadioButton azul;
    private final ButtonGroup onlyOne;
    //construtor de classe
    public JRadioButton01(){
        super("Teste de JRadioButton");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        campo = new JTextField("Clique na cor desejada e vaja o resultado", 25);
        campo.setFont(new Font("Serif", Font.PLAIN, 14));
        
        container.add(campo);
        amarelo = new JRadioButton("Amarelo");
        container.add(amarelo);
        vermelho = new JRadioButton("Vermelho");
        container.add(vermelho);
        azul = new JRadioButton("Azul");
        container.add(azul);
        onlyOne = new ButtonGroup();
        onlyOne.add(amarelo);
        onlyOne.add(vermelho);
        onlyOne.add(azul);
        
        TratadorRadioButton trat = new TratadorRadioButton();
        amarelo.addItemListener(trat);
        vermelho.addItemListener(trat);
        azul.addItemListener(trat);
        
        setSize(258, 100);
        setVisible(true);     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JRadioButton01 aplicacao = new JRadioButton01();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    private class TratadorRadioButton implements ItemListener{
        private Color cor;
        public void itemStateChaged(ItemEvent evento){
            if (evento.getSource() == vermelho)
                cor = Color.red;
            if(evento.getSource() == amarelo)
                cor = Color.yellow;
            if (evento.getSource()==azul)
                cor = Color.blue;
            campo.setBackground(cor);
        } 

        @Override
        public void itemStateChanged(ItemEvent ie) {
            
        }
    }
}
