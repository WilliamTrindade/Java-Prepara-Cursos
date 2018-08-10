/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferevaloresentreobjetos;

/**
 *
 * @author William
 */
public class TransfereValoresEntreObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.saldo = 100;
        c2.saldo = 200;
        c1.transfere(c2, 50);
        
        System.out.println("O saldo de c1 é " + c1.saldo);
        System.out.println("O saldo de c2 é " + c2.saldo);
    }
    
}
class Conta{
    int numero;
    double saldo;
    double limite;
    String nome;

//metodo saca
    void saca(double valor){
        this.saldo = this.saldo - valor;
    }
//metodo deposita
    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
//método transfere
    void transfere(Conta destino, double valor){
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
}