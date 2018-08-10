package arraysdereferenciasaobjetos;
/**
 *
 * @author William
 */
class Conta{
    int numero;
    double saldo;
    double limite;
}
public class ArraysDeReferenciasAObjetos01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array
        Conta[] minhasContas = new Conta[10];
        
        //objeto
        Conta minhaConta = new Conta();
        //primeira posicao do array
        minhasContas[0] = minhaConta;
        //printar
        minhaConta.saldo=1000;
        minhaConta.limite=1000;
        System.out.println(minhasContas[0].saldo);
        System.out.println(minhasContas[0].limite);
        
/*DIRETAMENTE */ System.out.println("============================");
       
//primeira posicao do array   //objeto
        minhasContas[1] = new Conta();
        //printar
        minhasContas[1].saldo = 3200.0;
        minhasContas[1].limite = 3200.0;
        System.out.println(minhasContas[1].saldo);
        System.out.println(minhasContas[1].limite);
    }
}
