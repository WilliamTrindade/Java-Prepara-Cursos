package metodoabstrato;
//classe abstrata 
abstract class Carro{    
    String Abastece;
    //Método Abstrato deve ser Override na subclasse
    abstract void VolumeDoSom(int VolumeDoSom);
   
    public void locomover(){
        System.out.println("O carro Esta em acelerando!!");
    }
    public void correr(){
        System.out.println("O carro em alta velocidade agora!!");
    }
      public void estacionar(){
        System.out.println("O carro estacionou!!");
    }
    public void  desligar(){
        System.out.println("O carro desligou!!");
    }
}
class Novo extends Carro{
    //metodo foi "Override" na classe abstrata
    @Override
    void VolumeDoSom(int VolumeDoSom) {
        System.out.println("O som tem volume de " + VolumeDoSom);
    }
}
public class MetodoAbstrato {
    public static void main(String[] args) {
        Novo Voyage_2010 = new Novo();
        Voyage_2010.locomover();
        Voyage_2010.correr();
        Voyage_2010.estacionar();
        Voyage_2010.desligar();
        Voyage_2010.VolumeDoSom(100);
    }
}