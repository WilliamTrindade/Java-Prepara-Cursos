
package DoWhile01;

/**
 *
 * @author William
 */
public class DoWhile01 {
    public static void main(String[] args) {
     
        while(true){
            System.out.println("Estou num loop");
            //Aqui sempre é true, este comando será executado!   
        }
        int var = 0;
     
        while(var % 435 == 4 ){
            var += (var*3);
            //O numero de vezes que este comando será executado dependerá do valor inicial da var
        }
    }
    
}
