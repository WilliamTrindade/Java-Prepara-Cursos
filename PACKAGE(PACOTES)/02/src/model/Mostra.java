/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
/**
 *
 * @author William
 */
public class Mostra {
    private int hora;
    private int minuto;
    private int segundo;
        public Mostra(){
            setTempo(0, 0, 0);
        }
    public void setTempo(int h, int m, int s){
        hora = ((h >= 0 && h<24)?h:0);
        minuto = ((m>=0 && m<60)?m:60);
        segundo = ((s>=0 && s<60)?s:60);
    }    
    public String horaUniversal(){
        DecimalFormat doisDigitos = new DecimalFormat("00");
        return doisDigitos.format(hora) + ":" + doisDigitos.format(minuto) + ":" + doisDigitos.format(segundo);
    }
}
