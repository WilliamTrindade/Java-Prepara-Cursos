package Pasta1;

class ClasseSub {
    private String charNome;
    //construtores
    public ClasseSub(){
        charNome = "Sem nome";
    }
    //fim
    public String getNome(){
        return charNome;
    }
    
}

public class Pasta1 {
        
    public static void main(String[] args) {
        ClasseSub char1;
        char1 = new ClasseSub();
        String resNome = char1.getNome();
        System.out.println("Nome:" + resNome);
    }
}