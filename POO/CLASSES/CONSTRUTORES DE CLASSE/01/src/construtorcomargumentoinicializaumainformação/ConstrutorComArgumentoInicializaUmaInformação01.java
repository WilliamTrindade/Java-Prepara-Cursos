package construtorcomargumentoinicializaumainformação;
class Cliente{
    String nome;
    String sobrenome;
    String cpf;
    String cep;
}
class Conta{
    int numero;
    Cliente titular;
    double saldo;
    double limite;
    //construtor com argumento
    //Ele recebe o titular da conta
    //Assim quando criamos uma conta ja damos um titular
    Conta(Cliente titular){
        this.titular = titular;
    }
}
public class ConstrutorComArgumentoInicializaUmaInformação01 {
    public static void main(String[] args) {
        Cliente william = new Cliente();
        william.nome = "william";
        
        Conta minhaConta = new Conta(william);
        System.out.println(minhaConta.titular.nome);
    }
    
}