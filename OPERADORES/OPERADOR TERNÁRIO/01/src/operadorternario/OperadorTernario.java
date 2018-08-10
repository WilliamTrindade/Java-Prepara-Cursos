package operadorternario;

/**
 *
 * @author William
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r, r2, r3;
        n1 = 4;
        n2 = 8;
        /*Exibe numeros como resultados*/System.out.println("==================");
        r = (n1 > n2) ? 0 : 1;
        System.out.println(r);
        
        /*com variaveis como resultados*/System.out.println("==================");
        r2 = (n1 > n2) ? n1 : n2;
        System.out.println(r2);
        
        /*Com formulas*/System.out.println("====================");
        r3 = (n1 > n2) ? n1 + n1 : n1 - n2;
        System.out.println(r3);
    }
    
}
