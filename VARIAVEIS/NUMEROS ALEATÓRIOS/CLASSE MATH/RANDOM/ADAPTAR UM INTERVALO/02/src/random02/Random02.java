package random02;

/**
 *
 * @author William
 */
public class Random02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Podemos adaptar o intervalo dos números gerados com algumas operações
        //matemáticas.
        double minimo = 1.0;
        double maximo = 5.0;
        
        // minimo <= numero < maximo
        double numero = minimo + Math . random () * ( maximo - minimo );
        System.out.println(numero);
    }
    
}
