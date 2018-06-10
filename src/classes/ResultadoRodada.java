/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allan
 */
public class ResultadoRodada {
    private int[] acertos;
    private int[] erros;
    private String[] percentAcertos;
    private String [] pangramas;
    private String[] nome;
    private int qntRodadas;
    private int pointer;

    public ResultadoRodada() {
        acertos = new int[10];
        erros = new int[10];
        percentAcertos = new String[10];
        nome = new String[10];
        pangramas = new String[10];
        qntRodadas=0;
        pointer=qntRodadas;
    }
    
    public void pressetValue(String nome, String pangrama, int acertos, int erros, float percentValue){
        if(qntRodadas==10){
            pointer=0;
        }
        this.nome[pointer]=nome;
        this.pangramas[pointer]= pangrama;
        this.acertos[pointer]=acertos;
        this.erros[pointer]=erros;
        this.percentAcertos[pointer]=String.format("%.2f", percentValue);
        qntRodadas++;
        pointer++;
        
        
    }

    public int getQntRodadas() {
        return qntRodadas;
    }

    public int getAcertos(int indice) {
        return acertos[indice];
    }

    public String getPercentAcertos(int indice) {
        return percentAcertos[indice];
    }

    public String getNome(int indice) {
        return nome[indice];
    }

    public int getErros(int indice) {
        return erros[indice];
    }

    public String getPangramas(int indice) {
        return pangramas[indice];
    }
    
    
    
}
