package classefinal;

/**
 *
 * @author William
 */

//nao pode ser extendida!
/*
class user extends Login{
    
}
*/
final class Login{
    int senhaNumerica;
}
public class ClasseFinal01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login n = new Login();
        n.senhaNumerica = 12345678;
    }
    
}
