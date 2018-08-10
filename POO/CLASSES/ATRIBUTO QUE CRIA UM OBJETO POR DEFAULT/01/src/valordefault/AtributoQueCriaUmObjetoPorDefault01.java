package valordefault;
class Cliente{
    String nome;
    String endereco;
    String cpf;

}
class Conta{
    int numero;
    double saldo;
    double limite;
    //ATRIBUTO QUE CRIA UM OBJETO DO TIPO CLIENTE JA POR DEFAULT EM QUARQUE CONTA
    Cliente titular = new Cliente();
}

public class AtributoQueCriaUmObjetoPorDefault01 {

    public static void main(String[] args) {
      //CRIO O OBJETO CONTA
      Conta william = new Conta();
      
      //APENAS EDITO OS ATRIBUTOS DO MEU OBJETO CLIENTE 
      //POIS JA FOI INSTANCIADO POR DEFAULT
      william.titular.nome = "William M.";
      
      //PRINTA O NOME DO TITULAR OU CLIENTE
      System.out.println(william.titular.nome);
    }
    
}
