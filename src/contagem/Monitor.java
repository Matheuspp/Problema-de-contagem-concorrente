/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contagem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;  

/**
 *
 * @author Matheus VR
 */
public class Monitor {
    private int somaV;
    private int somaL;
    private int somaD;
    private int index;
    private int tamanho_bloco;

    
    
    public Monitor(){
       
    }

    public int getSomaV() {
        return somaV;
    }

    public void setSomaV(int somaV) {
        this.somaV = somaV;
    }

    public int getSomaL() {
        return somaL;
    }

    public void setSomaL(int somaL) {
        this.somaL = somaL;
    }

    public int getSomaD() {
        return somaD;
    }

    public void setSomaD(int somaD) {
        this.somaD = somaD;
    }
    public int[] somar(int tamanho_bloco, int index) throws FileNotFoundException, IOException{
        int conta_linhas = 0;
        int cont_aux = 0;
        int somas[];
        somas = new int[3];
        
        somas[0] = 0;
        somas[1] = 0;
        somas[2] = 0;
        // ====================================================================================================================
        // lendo arquivo e contando numero de linhas
        File file; 
        file = new File("C:\\Users\\Matheus VR\\Documents\\NetBeansProjects\\contagem\\src\\contagem\\atualizarValores.txt");
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String st; 
        while ((st = br.readLine()) != null){
            conta_linhas++;
            
            if((conta_linhas >= index) && (conta_linhas < (index + tamanho_bloco))){
                 for(String s: st.split(" ")){
                   
                    int size = Integer.parseInt(s);
                    
                    if(cont_aux == 0){
                        somas[0] += size;
                    }else if(cont_aux == 1){
                        somas[1] += size;
                    }else{
                        somas[2] += size;
                    }
                    cont_aux++;
            }
                
            }
            cont_aux = 0;
        }    
        //=====================================================================================================================
        return somas;
    }
    
}
