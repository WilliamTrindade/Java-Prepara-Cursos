package testaduascontas;

/**
 *
 * @author William
 */
public class TestaDuasContas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objeto 1
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.saldo = 1000;
        
        //objeto 2
        Conta meuSonho;
        meuSonho = new Conta();
        meuSonho.saldo = 1500000;
    }
    
}
class Conta{
    double saldo;
}