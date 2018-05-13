/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;
import javax.swing.JOptionPane;



/**
 *
 * @author allan
 */


public class Pangramas {
    
    private String [] pangramaPt = {"Quem traz CD, LP, fax, engov e whisky JB?","Jane quer LP, fax, CD, giz, TV e bom whisky","TV faz quengo explodir com whisky JB","Gafanhotos azuis celebram a pequena terra das jovens bruxas","Um pequeno jabuti xereta viu dez cegonhas felizes"};
    private String [] pangramaEn = {"Jackdaws love my big sphinx of quartz","Pack my box with five dozen liquor jugs","A quick brown fox jumps over the lazy dog","Xylophone wizard begets quick jive form","Lazy movers quit hard packing of jewelry boxes"};
    private boolean tipoPangrama = false;//false = Portugues | true = Ingles
    
    
    public String getPangramaPt(){
        Random rand = new Random();
        return pangramaPt[rand.nextInt(5)];
    }
    public String getPangramaEn(){
        Random rand = new Random();
        return pangramaEn[rand.nextInt(5)];
    }
    public int alterarTipoPangrama(int i){
        if(i==0){//0 se for para portugues
            if(!tipoPangrama){//verifica se o portugues ja esta selecionado
               return -1;
            }
            tipoPangrama = false;
            return 0;
        }
        //caso for ingles
        if(tipoPangrama){
            return -1;
        }
        tipoPangrama = true;
        return 1;
    }
    
    public String carregarPangrama(){
        if(!tipoPangrama){
            return getPangramaPt();
        }else{
            return getPangramaEn();
        }
    }
}
