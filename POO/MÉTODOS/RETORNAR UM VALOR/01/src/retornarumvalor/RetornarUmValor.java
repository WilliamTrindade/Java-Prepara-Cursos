package retornarumvalor;
/**
 *
 * @author William
 */
public class RetornarUmValor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.nome = "William";
        minhaConta.saldo = 1000.0;
        
        //chamar o método(invocar) e printalo
        System.out.println(minhaConta.saca(500.0));
    }
    
}
 //Criar a classe de conta bancaria
        class Conta{
            int numero;
            String nome;
            double saldo;
            double limite; 
            
            //Método que vai retornar um true or false ao Sacar
            //Por isso nao vai ter VOID
            boolean saca(double valor){
                if(this.saldo < valor){
                    return false;
                }else{
                    this.saldo = this.saldo - valor;
                    return true;
                }
            }
        } 