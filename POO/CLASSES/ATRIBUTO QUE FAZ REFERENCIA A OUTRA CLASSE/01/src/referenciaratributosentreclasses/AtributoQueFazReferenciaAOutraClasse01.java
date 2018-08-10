package referenciaratributosentreclasses;

/**
 *
 * @author William
 */
class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}
class Conta{
    //var de referencia (atributo) da classe do Cliente
    Cliente titular;
    
    int numero;
    double saldo;
    double limite;
    
}
//main
public class AtributoQueFazReferenciaAOutraClasse01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objeto conta
        Conta minhaContaBancaria = new Conta();
        //objeto cliente
        Cliente william = new Cliente();
        
        //o atributo titular da conta é o objeto criado com a classe Cliente.
        //Digo que o titular da conta é o objeto Cliente
        minhaContaBancaria.titular = william;
        
        //Printando o nome do titular
        minhaContaBancaria.titular.nome="william";
        System.out.println(minhaContaBancaria.titular.nome);
    }
    
}
