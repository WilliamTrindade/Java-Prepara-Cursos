/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldocontas;

/**
 *
 * @author William
 */
public class SaldoContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta c1;
       c1 = new Conta();
       c1.deposita = 200;
       //Aqui c2 e c1 vao referenciar o mesmo objeto!!
       Conta c2 = c1;
       c2.deposita = 100;
       
       System.out.println(c1.deposita);
       System.out.println(c2.deposita);
    }
    
}
class Conta{
    int numero;
    double deposita;
    double saldo;
}