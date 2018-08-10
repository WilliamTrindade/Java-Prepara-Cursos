package testareferencias;
/**
 *
 * @author William
 */
class TestaReferencias {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Conta c1 = new Conta();
       c1.saldo = 200;
       c1.deposita(100);
       
       
       Conta c2 = new Conta();
       c2.saldo = 200;
       c2.deposita(100);
       
       System.out.println(c1.saldo);
       System.out.println(c2.saldo);
    
}

}
class Conta{
   double saldo;
    void deposita (double quantidade){
        this.saldo = this.saldo-quantidade;
    }
}