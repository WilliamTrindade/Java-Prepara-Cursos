package exemplopolimorfisodin;
class SerVivo{
    String alimentos;
    double idade;
    
    //Metodos da Superclasse
    void locomover(){
        
    }
    void nascer(){
        
    }
     void alimentar(){
        
    }
    void respirar(){
        
    }
     void crescer(){
        
    }
    void reproduzir(){
        
    }
    void morrer(){
        
    }
}
class Animal extends SerVivo{
    String habitat;
    String formaLocomoçao;
    int tempoMédioDeVida;
    
    //redefinir o método na SubClasse
    @Override
    void locomover(){
        
    }
    @Override
    void nascer(){
        
    }
    @Override
     void alimentar(){
        
    }
    @Override
    void respirar(){
        
    }
    @Override
     void crescer(){
        
    }
    @Override
    void reproduzir(){
        
    }
    @Override
    void morrer(){
        
    }
}
public class AnimalESerVivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
