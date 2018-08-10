/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criarumobjetodecontabancaria;

/**
 *
 * @author William
 */
public class CriarUmObjetoDeContaBancaria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criar a classe de conta bancaria
        class Conta{
            int numero;
            String nome;
            double saldo;
            double limite;
        } 
        //criar o objeto da classe conta
        Conta minhaConta;//declarar uma variavel do tipo conta
        minhaConta = new Conta();//instanciar o objeto
    }
    
}
