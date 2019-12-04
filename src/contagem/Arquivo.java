/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contagem;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus VR
 */
public class Arquivo implements Runnable {

    private final int num_linhas_bloco;
    private final String caminho_atualiza = "C:\\Nova pasta\\atualizarValores.txt";
    private final String caminho_diminui = "C:\\Nova pasta\\diminuirValores.txt";
    private final int index;
    
    public Arquivo(int num_linhas_bloco, int index){
        this.num_linhas_bloco = num_linhas_bloco;
        this.index = index;
    }
    @Override
    public void run(){
        
        int arr[] = null;
        int arr2[] = null;
        Monitor novo = new Monitor();
                       
        // ===================================================================================================================
        try {
            arr = novo.somar(num_linhas_bloco, index, caminho_atualiza);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            arr2 = novo.somar(num_linhas_bloco, index, caminho_diminui);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0;i < 3;i++){
            arr[i] -= arr2[i];
            System.out.println(arr[i]);
           
        }
        
    }
}
