package movcontacorrente;
/**
 *
 * @author William
 */
public class MovContaCorrente {
    public static void main(String[] args) {
        class Conta{
            int numero;
            String nome;
            double saldo;
            double limite;
            double saca;
            double deposita;
        }
        
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.nome = "William";
        minhaConta.saldo = 1000.0;
        minhaConta.saca = 200;
        minhaConta.deposita = 500;
        
        System.out.println(minhaConta.saldo - minhaConta.saca + minhaConta.deposita);
    } 
}