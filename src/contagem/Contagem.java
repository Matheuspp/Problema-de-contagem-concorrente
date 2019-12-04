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
        String caminho_atualiza = "C:\\Nova pasta\\atualizarValores.txt";
        String caminho_diminui = "C:\\Nova pasta\\diminuirValores.txt";
        
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
        
        // thread 1
        Thread t1 = new Thread(new Arquivo(num_linhas_bloco, 1));
        t1.start();
        /*
        // thread 2
        Thread t2 = new Thread(new Arquivo(num_linhas_bloco, (1*num_linhas_bloco)));
        t2.start();
        
        // thread 3
        Thread t3 = new Thread(new Arquivo(num_linhas_bloco, (2*num_linhas_bloco)));
        t3.start();
        
        // thread 4
        Thread t4 = new Thread(new Arquivo(num_linhas_bloco, (3*num_linhas_bloco)));
        t4.start();
        
        // thread 5
        Thread t5 = new Thread(new Arquivo(num_linhas_bloco, (4*num_linhas_bloco)));
        t5.start();
                
        // thread 6
        Thread t6 = new Thread(new Arquivo(num_linhas_bloco, (5*num_linhas_bloco)));
        t6.start();
        
        // thread 7
        Thread t7 = new Thread(new Arquivo(num_linhas_bloco, (6*num_linhas_bloco)));
        t7.start();
        
        // thread 8
        Thread t8 = new Thread(new Arquivo(num_linhas_bloco, (7*num_linhas_bloco)));
        t8.start();
        
        // thread 9
        Thread t9 = new Thread(new Arquivo(num_linhas_bloco, (8*num_linhas_bloco)));
        t9.start();
        
        // thread 10
        Thread t10 = new Thread(new Arquivo(num_linhas_bloco, (9*num_linhas_bloco)));
        t10.start();
        */
        
            
         
       
        
    }//
    
}
