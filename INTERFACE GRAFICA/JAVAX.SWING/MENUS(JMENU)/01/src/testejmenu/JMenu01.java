package testejmenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenu01  extends JFrame{
    private final Color colorValues[] = {
        Color.black, Color.blue, Color.red, Color.green
    };
    
    private final JRadioButtonMenuItem[] itensDasCores;
    private final JRadioButtonMenuItem[] fontes;
    private final JCheckBoxMenuItem itensDosEstilos[];
    private final JLabel texto;
    private final ButtonGroup umaUnicaFonte;
    private final ButtonGroup umaUnicaCor;
    private int estilo;
    private Icon carta = new ImageIcon("figuras/carta.gif");
    private final Icon figura1 = new ImageIcon("figuras/logo.png");
    public JMenu01(){
        super("Testando Jmenus");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        JMenuItem itemFigura1 = new JMenuItem("Figura1");
        itemFigura1.setMnemonic('F');
        itemFigura1.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent evento){
                        inserir();
                    }
                }
        );
        
        menuArquivo.add(itemFigura1);
        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.setMnemonic('S');
        itemSair.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    System.exit(0);
                }
            }
        );
        menuArquivo.add(itemSair);
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('H');
        JMenuItem itemUniversitarios = new JMenuItem("Aluno");
        itemUniversitarios.setMnemonic('U');
        itemUniversitarios.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                    JOptionPane.showMessageDialog(JMenu01.this,"Bem Vindo ao Java", "Ajuda", JOptionPane.PLAIN_MESSAGE);
                }
            }
        );
        menuAjuda.add(itemUniversitarios);
        JMenuItem itemCartas = new JMenuItem("Cartas");
        itemCartas.setMnemonic('C');
        itemCartas.addActionListener((ActionEvent event) -> {
            JOptionPane.showMessageDialog(JMenu01.this,"Java", "Cartas", JOptionPane.PLAIN_MESSAGE, carta);
        });
        menuAjuda.add(itemCartas);
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menuArquivo);
        barra.add(menuAjuda);
        JMenu formatMenu = new JMenu("Formatar");
        formatMenu.setMnemonic('r');
        String cores[] = {
            "Preto", "Azul", "Vermelho", "Verde"
        };
        JMenu menuCor = new JMenu("Cor");
        menuCor.setMnemonic('C');
        itensDasCores = new JRadioButtonMenuItem[cores.length];
        umaUnicaCor = new ButtonGroup();
        TratadorDeItens trat = new TratadorDeItens();
        int count;
        
        for (count = 0; count < cores.length; count++){
            itensDasCores[count] = new JRadioButtonMenuItem(cores[count]);
            menuCor.add(itensDasCores[count]);
            umaUnicaCor.add(itensDasCores[count]);
            itensDasCores[count].addActionListener(trat);
        }
        itensDasCores[0].setSelected(true);
        formatMenu.add(menuCor);
        formatMenu.addSeparator();
        String nomeDasFontes[] = {
            "Serif", "Monospaced", "SansSerif"
        };
        JMenu menuFonte = new JMenu("Fonte");
        menuFonte.setMnemonic('n');
        fontes = new JRadioButtonMenuItem[3];
        umaUnicaFonte = new ButtonGroup();
        for(count = 0; count < fontes.length; count ++){
            fontes[count] = new JRadioButtonMenuItem(nomeDasFontes[count]);
            menuFonte.add(fontes[count]);
            umaUnicaFonte.add(fontes[count]);
            fontes[count].addActionListener(trat);
        }
        
        fontes[0].setSelected(true);
        menuFonte.addSeparator();
        String estiloName[] = {
            "Bold", "Italic"
        };
        
        itensDosEstilos = new JCheckBoxMenuItem[estiloName.length];
        TratadorDeEstilo estiloHandler;
        estiloHandler = new TratadorDeEstilo() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        for(count = 0; count < estiloName.length; count++){
            itensDosEstilos[count] = new JCheckBoxMenuItem(estiloName[count]);
            menuFonte.add(itensDosEstilos[count]);
            itensDosEstilos[count].addItemListener(estiloHandler);
        }
        
        formatMenu.add(menuFonte);
        barra.add(formatMenu);
        texto = new JLabel("java curso", SwingConstants.CENTER);
        texto.setForeground(colorValues[0]);
        texto.setFont(new Font("TimesRoman", Font.PLAIN, 72));
        container.setBackground(Color.white);
        container.add(texto);
        setSize(700, 500);
        setVisible(true);
    }
    
    public void inserir(){
        JLabel labelFigura1 = new JLabel();
        labelFigura1.setIcon(figura1);
        this.getContentPane().add(labelFigura1);
        this.repaint();
        this.show();
    }
    public static void main(String[] args) {
        JMenu01 application = new JMenu01();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class TratadorDeItens implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            for (int count = 0; count < itensDasCores.length; count++)
                if(itensDasCores[count].isSelected()){
                    texto.setForeground(colorValues[count]);
                    break;
                }
            
            for (int count = 0; count < fontes.length; count ++)
                if(event.getSource()==fontes[count]){
                    texto.setFont(new Font(fontes[count].getText(), estilo, 72));
                    break;
                }
            repaint();
        }
    }
    private abstract class TratadorDeEstilo implements ItemListener{
        public void ItemStateChanged(ItemEvent item){
            estilo = 0;
            if(itensDosEstilos[0].isSelected())
                estilo = estilo + Font.BOLD;
            if(itensDosEstilos[1].isSelected())
                estilo = estilo + Font.ITALIC;
            texto.setFont(new Font(texto.getFont().getName(), estilo, 72));
            repaint();
        }
    }
}
