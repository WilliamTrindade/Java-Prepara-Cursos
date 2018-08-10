package classeabstrata;

/**
 *
 * @author William
 */

//Nao pode ser Instanciada
abstract class Carro{
    String abastece;
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
//Herda todos os metodos e atributos normalmente
//E pode ser instanciada
class Novo extends Carro{
   
}

class ClasseAbstrata01 {
    public static void main(String[] args) {
        Novo Voyage_2010 = new Novo();
        Voyage_2010.locomover();
        Voyage_2010.correr();
        Voyage_2010.estacionar();
        Voyage_2010.desligar();
    }
    
}
