package DAO;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author William
 */
public class BancoDeDados01 {
    public static void main (String args[]) throws ClassNotFoundException{
    //No codigo esta se fazendo a conexao JDBC no Xammp (servidor MYSQL) , 
    //usando o caminho localhost passando pela porta 3306
    //e conectando com o db_teste;
        String url = "jdbc:mysql://localhost:3306/db_teste";
    //Pra dar acesso precidsamos definir o user e senha do BD
    //Usaamos o padrao root e sem senha
        String user = "root";
        String pass = "";
     
    //Aqui é onde fazemos o primiro teste com o BD se a conexao tiver correta,
    //vai mostrar OK!
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("OK");
        Statement stm = con.createStatement();
        String SQL = "SELECT * FROM `clientes`";
        ResultSet rs = stm.executeQuery(SQL);
        //Após o primeiro teste
        //o teste busca nos campos da tabela Clientes(ID e Nome) se existe algo resgistrado
        //Caso nao tenha ele mostrara em GUI o resultado nulo ou vazio de apos Mostrara 
        //no console o ID e o Nome Vazio
        while(rs.next()){
            String ID = rs.getString("ID");
            String NOME = rs.getString("NOME");
            JOptionPane.showMessageDialog(null, "ID:" + ID + "/n" + "NOME:" + NOME);
            System.out.println("id:" + ID);
            System.out.println("Nome:" + NOME);
        }
    }   
 //
    
    catch (ClassNotFoundException e){
        System.out.println("Classe nao encontrada");
        
    }
    catch (SQLException e){
        System.out.println("Problemas com o BD" + e);
    }
    }
    
}
