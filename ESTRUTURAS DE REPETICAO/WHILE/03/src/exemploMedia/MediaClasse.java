package exemploMedia;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class MediaClasse {
    public static void main(String args []) {
        //variaveis
        int escolha;
        double notasLidas;
        double media;
        double total;
        double alunos;
        double valorNota;
        String quantidade;
        String nota;
        String continua;
        String exibir;        
        //escolha é sim!
        escolha = 1;
        
        //enquanto a escolha for sim!
        while(escolha != 0){
            total = 0;
            notasLidas = 1;
            
        //obter alunos na variavel alunos com o valor da variavel quantidade 
        //convertida em inteira com o metodo parseDouble da classe Double.
        quantidade = JOptionPane.showInputDialog("Qual o Número de Alunos?<entre com um número inteiro!>:");
        alunos = Double.parseDouble(quantidade);
        //enquanto o numero de alunos escolhido for maior que as notas lidas que é = 1 !
        while(notasLidas <= alunos){
            nota = JOptionPane.showInputDialog("Entre com a nota:");
            valorNota = Double.parseDouble(nota);
            total = total + valorNota;
            notasLidas = notasLidas + 1;
        }
        
        media = total / alunos;
        DecimalFormat mostraDecimal = new DecimalFormat("0");
        exibir = ("A media da Classe é:") + mostraDecimal.format(media);
        
        JOptionPane.showMessageDialog(null, exibir, "Média da Classe", JOptionPane.INFORMATION_MESSAGE);
        
        continua = JOptionPane.showInputDialog("Efetuar outro calculo? <0=Sair / 1 = Continuar>");
        escolha = Integer.parseInt(continua);  
    }
     System.exit(0);   
  }
}