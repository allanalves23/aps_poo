/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class Jogo {
    private int erros;
    private int acertos;
    private float porcentagemAcerto;
    private boolean inicio;
    private int index;
    private int tamanhoPangrama;
    
    public Jogo(){
        erros = 0;
        acertos = 0;
        porcentagemAcerto = 0;
        inicio = false;
        index = 0; 
        tamanhoPangrama = 0;
    }
    
    public void inicioJogo(String pangrama){
        tamanhoPangrama = pangrama.length();
        inicio = true;
    }
    
    public boolean contagem(String pangrama ,char letra){
        
        if(inicio){
            tamanhoPangrama = pangrama.length();
            if(pangrama.charAt(index)==letra){
                index++;
                setAcertos();
                setPercent();
                if(index==tamanhoPangrama) {
                    fimJogo();
                }   
                return true;
            }else{
                setErros();
                setPercent();
                return false;
            }
        }

        return false;
    }
    
    public void setAcertos(){
        acertos++;
    }
    
    public void setErros(){
        erros++;
    }
    
    public int getAcertos(){
        return acertos;
    }
    
    public int getErros(){
        return erros;
    }
    
    public void setPercent(){
        //int total = getAcertos() - getErros();
        //porcentagemAcerto = total / getAcertos();
        float total = getAcertos() + getErros();
        porcentagemAcerto = (getAcertos()/total)*100;
        
    }
   
    public float getPercent(){
        return porcentagemAcerto;
    }
    public boolean fimJogo(){
       if(index == tamanhoPangrama) return true;
       return false;
    }
}
