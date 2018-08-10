package testejbutton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author William
 */
public class JButton01 extends JFrame {
    //campos e botoes
    private JTextField campo1, campo2;
    private JLabel nome, sobrenome;
    private JButton botao1;
    private JButton botao2;
    
    //Construtor
    public JButton01(){
        super("Testando componentes JButton");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        nome = new JLabel("Nome");
        nome.setToolTipText("Escreva seu nome no campo ao lado");
        container.add(nome);
        campo1 = new JTextField(15);
        container.add(campo1);
        sobrenome = new JLabel("Sobrenome");
        sobrenome.setToolTipText("Escreva seu nome no campo ao lado");
        container.add(sobrenome);
        campo2 = new JTextField(15);
        container.add(campo2);
        JButton botao1 = new JButton("Adicionar");
        botao1.setMnemonic(KeyEvent.VK_A);
        botao1.setToolTipText("Une o nome ao sobrenome");
        container.add(botao1);
        
        Icon erase1 = new ImageIcon("figuras/erase1.png");
        Icon erase2 = new ImageIcon("figuras/erase2.png");
        
        JButton botao2 = new JButton("Apagar", erase1);
        botao2.setRolloverIcon(erase2);
        botao2.setMnemonic(KeyEvent.VK_P);
        botao2.setToolTipText("Limpa os campos nome e sobrenome");
        container.add(botao2);
        
        botao1.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent evento){
                        JOptionPane.showMessageDialog(null, "Seu nome Completo é:" + campo1.getText() + campo2.getText());
                    }
                });
        
        botao2.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent envento){
                    campo1.setText("");
                    campo2.setText("");
                    repaint();
                }
            }
        );
        setSize(525, 125);
        setVisible(true); 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JButton01 aplicacao = new JButton01();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
