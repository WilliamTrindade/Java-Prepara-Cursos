package animal;
class AnimaisComendo{
    public void comer(){
        System.out.println("Animal Comendo...");
    }
}
    class Cao extends AnimaisComendo{
        @Override
        public void comer(){
            System.out.println("Cão Comendo...");
        }
    }
    class Tigre extends AnimaisComendo{
        @Override
        public void comer(){
            System.out.println("Tigre Comendo...");
        } 
    }
class Animal{
        public void fazerAnimalComer(AnimaisComendo animaiscomendo){
            animaiscomendo.comer();
        }
        public static void main(String[] args){
            Animal t = new Animal();
            t.fazerAnimalComer(new AnimaisComendo());
            t.fazerAnimalComer(new Cao());
            t.fazerAnimalComer(new Tigre());
            
        }
    }
