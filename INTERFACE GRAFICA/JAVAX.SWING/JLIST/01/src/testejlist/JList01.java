package testejlist;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author William
 */

public class JList01 extends JFrame {
    private JList listaDeCores, listaSelecionavel, listaDeTexto;
    private Container container;
    private JPanel direita, esquerda;
    
    private String nomeDasCores[] = {
        "Preto", "Azul", "Azul Claro", "Cinza Escuro", "Cinza", "Verde", "Cinza Claro", "Magenta", "Laranja", "Rosa", "Vermelho", "Branco", "Amarelo"
    };
    
    private Color cores[]= {
        Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow
    };
    
    public JList01(){
        super("Testando JList");
        container = getContentPane();
        container.setLayout(new GridLayout(1, 2));
        esquerda = new JPanel();
        esquerda.setLayout(new BorderLayout());
        direita = new JPanel();
        direita.setLayout(new BorderLayout());
        listaSelecionavel = new JList(nomeDasCores);
        listaSelecionavel.setVisibleRowCount(5);
        
        listaSelecionavel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        listaDeTexto= new JList();
        listaDeTexto.setVisibleRowCount(5);
        listaDeTexto.setFixedCellWidth(10);
        listaDeTexto.setFixedCellHeight(10);
        listaDeCores = new JList(nomeDasCores);
        listaDeCores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaDeCores.setVisibleRowCount(5);
        esquerda.add(new JScrollPane(listaDeCores), BorderLayout.NORTH);
        direita.add(new JScrollPane(listaDeCores), BorderLayout.CENTER);
        //////
        container.add(esquerda);
        container.add(direita);
        
        listaSelecionavel.addListSelectionListener(
                new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent evento){
                        listaDeTexto.setListData(
                            listaSelecionavel.getSelectedValues()
                        );
                    }
                }
        );
        
        listaDeCores.addListSelectionListener(
                new ListSelectionListener(){
                   public void valueChanged(ListSelectionEvent evento){
                       esquerda.setBackground(
                               cores[listaDeCores.getSelectedIndex()]
                       );
                   }
                }
        );
        
        setSize(400, 250);
        setVisible(true);
    }
    public static void main(String[] args) {
        JList01 aplicacao = new JList01();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
