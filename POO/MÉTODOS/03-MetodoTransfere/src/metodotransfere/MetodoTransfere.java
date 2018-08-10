/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodotransfere;

/**
 *
 * @author William
 */
public class MetodoTransfere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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