package testejdesktop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author William
 */
public class JDesktop01 extends JFrame {
    private JDesktopPane desktop;
    //configura a GUI
    public JDesktop01(){
        super("Testando JInternal Frame contidade em" + "uma JDesktopPane");    
    //cria barra de menus
    JMenuBar barra = new JMenuBar();
    //cria menu arquivo
    JMenu arquivo = new JMenu("Arquivo");
    //cria itens do menu "Arquivo"
    JMenuItem novo = new JMenuItem("Novo");
    JMenuItem sair = new JMenuItem("Sair");
    
    //anexa os itens ao menu "Arquivo"
    arquivo.add(novo);
    arquivo.add(sair);
    //anexa o menu "Arquivo" a barra de menus
    barra.add(arquivo);
    //anexa a barra de menus a janela do aplicativo
    setJMenuBar(barra);
    
    //Configura a "desktop"
    desktop = new JDesktopPane();
    desktop.setBackground(Color.lightGray);
    desktop.setToolTipText("Eu sou a JDesktopPane"+"Voce pode utilizar meu menu");
    this.getContentPane().add(desktop);
    //configura ouvinte para item de menu "novo"
    novo.addActionListener(
        //classe interna anonima pra tratar de eventos do 
        //item de menu "Novo"
        new ActionListener(){   
            //exibe nova janela
            @Override
            public void actionPerformed(ActionEvent evento){    
            //cria janela interna
                JInternalFrame frame = new JInternalFrame("Janela Interna", true, true, true, true);
                //obtem painel de conteudo da janela interna
                Container container = frame.getContentPane();
                JanelaInterna interna;
                interna = new JanelaInterna();
                //anexa ao painel de conteudo da janela interna
                //um objeto da classe "JanelaInterna"
                container.add(interna, BorderLayout.CENTER);
                //connfigura o tamanho da janela interna com o tamanho
                //do seu conteudo
                frame.pack();
                //anexa a janela interna a "Desktop" e a exibe 
                desktop.add(frame);
                frame.setVisible(true);
            }
        }
    );
    //configura o ouvinte para o item de menu "Sair"
    sair.addActionListener(
    //classe interna anonima para trazer eventos do item de menu sair
        new ActionListener(){
        //encerra o aplicativo
            @Override
            public void actionPerformed(ActionEvent Evento){
                System.exit(0);
            }
        }
    );
    //determina o size
    setSize(700, 600);
    //determina que o conteudo anexado a janela seja exibido
    setVisible(true);
}
    public static void main(String[] args) {
        JDesktop01 aplicacao = new JDesktop01();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class JanelaInterna extends JPanel{
    private JTextArea areaTexto;
    public JanelaInterna(){
        //criar arera de texto
        areaTexto = new JTextArea(25, 25);
        //configura mudança automatica de linha
        areaTexto.setLineWrap(true);
        //determina que mudanças de linhas sejam definidas pelas palavras
        areaTexto.setText("Eu sou programador JAVA");
        //adiciona barras de rolagem se o tamanho da area de texto for
        //insuficiente para exibir o texto
        this.add(new JScrollPane(areaTexto));
    }
}