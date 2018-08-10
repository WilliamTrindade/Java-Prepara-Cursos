package getset;
class Cliente{
    String nome;
    String endereco;
    String cpf;
}
class Conta{
    //DEIXO MEU ATRIBUTOS EM PRIVADO
    private double saldo;
    private double limite;
    private Cliente titular;
    //CRIO OS MÉTODOS PARA DAR GET E SET
    //MUDAR E RETORNAR O VALOR DOS MEUS ATRIBUTOS
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
}
/**
 *
 * @author William
 */
public class GetSet01 {
    public static void main(String[] args) {
        //CRIO UMA CONTA E UM CLIENTE
        Cliente William = new Cliente();
        William.nome = "William";
        Conta minhaConta = new Conta();
        //DIGO QUE MEU CLIENTE É TITULAR DA CONTA
        minhaConta.setTitular(William);
        //MUDO O SALDO DA CONTA
        minhaConta.setSaldo(100);
        
        //PRINTO OS METODOS GET JÁ QUE OS ATRIBUTOS TAO EM PRIVADO
        //E ESSES METODOS ME RETORNAM O VALOR DOS ATRIBUTOS
        System.out.println(minhaConta.getSaldo());
        System.out.println(minhaConta.getTitular().nome);
        
    }
    
}
