package alterarosdadosdoobjetominhaconta;

/**
 *
 * @author William
 */
public class AlterarOsDadosDoObjetoMinhaConta {
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
        } 
        
        //criar o objeto da classe conta
        Conta minhaConta;//declarar uma variavel do tipo conta
        minhaConta = new Conta();//instanciar o objeto
        
        //acessar e alterar os dados do objeto
        minhaConta.nome = "William";
        minhaConta.saldo = 1000.0;
            System.out.println("Saldo atual:" + minhaConta.saldo);
    }
    
}
