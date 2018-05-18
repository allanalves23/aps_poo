/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author allan
 */
public class Jogo {
    private int erros;//flag de erros
    private int acertos;//flag de acertos
    private float porcentagemAcerto;//flag da porcentagem de acerto
    private boolean inicio;//flag de inicio do jogo
    private int index;//flag de verificação para a progressão do pangrama
    private int tamanhoPangrama;//Armazena o tamanho em caracteres do pangrama ativo

    public Jogo(){
        erros = 0;
        acertos = 0;
        porcentagemAcerto = 0;
        inicio = false;
        index = 0; 
        tamanhoPangrama = 0;
    }
    
    public void inicioJogo(String pangrama){//inicia o game
        tamanhoPangrama = pangrama.length();
        inicio = true;//starta o jogo
    }
    
    public boolean contagem(String pangrama ,char letra){
        //Realiza a verificação da tecla pressionada
        int ad=0;
        if(inicio){//verfica se o jogo iniciou
            tamanhoPangrama = pangrama.length();
            if(pangrama.charAt(index)==letra){//verifica se a letra do pangrama indexada e igual à letra pressionada
                index++;//incrementa o index para proxima letra
                setAcertos();//incrementa a quantidade de acertos
                setPercent();//recalcula a porcentagem de acerto 
                return true;
            }else{
                
                //carregarLetrasErradas(letra);
                //printArray();
                setErros();//incrementa a quantidade de erros
                setPercent();//recalcula a porcentagem de acerto
                return false;
            }
            
        }

        return false;
    }
    
    public void setAcertos(){//incrementa a quantidade de acertos
        acertos++;
    }
    
    public void setErros(){//incrementa a quantidade de erros
        erros++;
    }
    
    public int getAcertos(){//captura a quantidade de acertos
        return acertos;
    }
    
    public int getErros(){//captura a quantidade de erros
        return erros;
    }
    
    public void setPercent(){
        //calcula a porcentagem de acertos
        float total = getAcertos() + getErros();
        porcentagemAcerto = (getAcertos()/total)*100;
    }
   
    public float getPercent(){//captura a porcentagem de acertos
        return porcentagemAcerto;
    }    
    public boolean fimJogo(){
        //verifica o se o jogo terminou
            return index == tamanhoPangrama;//retorna true caso a expressão for verdade
    }
}
