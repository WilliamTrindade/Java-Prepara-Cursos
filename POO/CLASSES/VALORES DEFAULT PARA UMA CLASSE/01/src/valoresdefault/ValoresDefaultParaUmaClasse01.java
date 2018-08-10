package valoresdefault;
//Podemos criar uma classe 
//Todas os objetos criados terao os valores default(ou pré-definidos)
    class Conta{
        int numero = 1234;
        String dono = "william";
        String cpf = "123.456.789-0";
        double saldo = 1000;
        double limite = 1000;
    }
/**
 *
 * @author William
 */
public class ValoresDefaultParaUmaClasse01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criei um objeto tipo conta
        //ja esta com valores default
        Conta minhaConta = new Conta();
        System.out.println(minhaConta.numero);
        System.out.println(minhaConta.dono);
        System.out.println(minhaConta.cpf);
        System.out.println(minhaConta.saldo);
        System.out.println(minhaConta.limite);
    }
    
}
