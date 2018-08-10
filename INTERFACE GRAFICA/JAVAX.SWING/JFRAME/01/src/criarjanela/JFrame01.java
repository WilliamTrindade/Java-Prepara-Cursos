package criarjanela;
/**
 *
 * @author William
 */
import javax.swing.*;

public class JFrame01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto janela
        JFrame janela = new JFrame("Primeira Janela em java");
        //seta posicao e tamanho
        janela.setBounds(500, 300, 400, 150);
        //setDefaultCloseOperation
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //Exibe a janela
        janela.setVisible(true);
    }
    
}
