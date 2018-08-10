package metodosaca;
/**
 *
 * @author William
 */
public class MetodoSaca {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Criar a classe de conta bancaria
        class Conta{
            int numero;
            String nome;
            double saldo;
            double limite;
            //
            double salario;
            //metodo que saca
            void saca(double quantidade){
                double novoSaldo = this.saldo - quantidade;
                this.saldo = novoSaldo;
            }
        } 
        
       
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.nome = "William";
        minhaConta.saldo = 1000.0;
            System.out.println("Saldo atual:" + minhaConta.saldo);
    }

}
