package exemplo;
class Cliente{
    String nome;
    String cpf;
    String endereco;
}
class Conta{
    Cliente titular;
    int numero;
    double saldo;
    double limite;
    //Sempre que criar um objeto isso inicializa!!
    Conta(){
        System.out.println("Iniciou uma Conta!!!");
    }
}
public class ConstrutorComArgumentoInicializaUmaInformação02 {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
    }
    
}
