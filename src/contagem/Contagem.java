/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contagem;
import java.io.*;

/**
 *
 * @author Matheus VR
 */
public class Contagem {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int num_linhas = 0;
        int num_linhas_bloco;
        String caminho_atualiza = "C:\\Users\\Matheus VR\\Documents\\NetBeansProjects\\contagem\\src\\contagem\\atualizarValores.txt";
        String caminho_diminui;
        
        // TODO code application logic here
        
        // ====================================================================================================================
        // lendo arquivo e contando numero de linhas
        File file; 
        file = new File(caminho_atualiza);
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String st; 
        while ((st = br.readLine()) != null){ 
            num_linhas++;
            
           
        }
        //=====================================================================================================================
        
        num_linhas_bloco = num_linhas / 10; // linhas por bloco
        int arr[];
        Monitor novo = new Monitor();
        
        
        
        // ===================================================================================================================
        // threads
        
        arr = novo.somar(num_linhas_bloco, 1, caminho_atualiza);
        for(int i = 0;i < 3;i++){
            System.out.println(arr[i]);
        }
        
            
         
       
        
    }//
    
}
