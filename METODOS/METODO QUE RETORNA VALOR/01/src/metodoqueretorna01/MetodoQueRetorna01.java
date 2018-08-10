package metodoqueretorna01;
/**
 *
 * @author William
 */
public class MetodoQueRetorna01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    //Metodo estatico do tipo de retorno int
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
}

