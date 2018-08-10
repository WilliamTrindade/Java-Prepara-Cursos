/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negacao01;

/**
 *
 * @author William
 */
public class Negacao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NAO = !
        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 & !amigoDoDono){
            System.out.println("Não pode entrar");
        }else{
            System.out.println("Pode Enntrar");
        }
    }
}
