package metodofinal;

class Login{
    //nao pode ser sobreescrito pois é final
    public final void checkPassword(String senha){
        if ("w1234567890".equals(senha)){
            System.out.println("Acesso feito com sucesso!");
        }else{
            System.out.println("Acesso Negado!");
        }
              
    }
}
public class MetodoFinal {
    public static void main(String[] args) {
        Login FacebookLogin = new Login();
        FacebookLogin.checkPassword("w1234567890");
        
    }
    
}
