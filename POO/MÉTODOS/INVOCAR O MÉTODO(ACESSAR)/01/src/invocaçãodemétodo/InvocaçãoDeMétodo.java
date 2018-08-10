package invocaçãodemétodo;
/**
 *
 * @author William
 */
public class InvocaçãoDeMétodo {
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
            //Nesses Métodos posso USAR ou NAO USAR a variavel auxiliar NOVO SALDO!
            //metodo que saca
            void saca(double quantidade){
                double novoSaldo = this.saldo - quantidade;
                this.saldo = novoSaldo;
            }
            //metodo que deposita
            void deposita(double quantidade){
                this.saldo = this.saldo + quantidade;
            }
        } 
        
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.nome = "William";
        minhaConta.saldo = 1000.0;
        
        //Acessar os método (invocar)
        minhaConta.saca(200);
        minhaConta.deposita(500);
            System.out.println("Saldo atual:" + minhaConta.saldo);
    }
}
