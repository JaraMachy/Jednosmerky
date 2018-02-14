/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo1;

/**
 *
 * @author Jára
 */
public class Algo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Obousmernost(); 
    }
    
    public static void Obousmernost(){
        
        int[][] sousednosti = {
            {0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,1,0},
            {0,1,0,1,0,0,0,0},
            {0,0,1,0,0,0,0,0},
            {0,0,0,1,0,1,0,0},
            {0,0,1,0,0,0,1,0},
            {0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0}
        };
        
        for(int i =0; i<= sousednosti.length-1; i++){
            for(int j=0; j<=i; j++) {
                if((sousednosti[i][j] + sousednosti[j][i])==2){
                    System.out.println((i+1) + "" + (j+1) + " - obousměrka");
                }
                else if(sousednosti[i][j]==1 && sousednosti[j][i]==0){
                    System.out.println((i+1) + "" + (j+1) + " - jednosměrka");
                }
                else if(sousednosti[i][j]==0 && sousednosti[j][i]==1){
                    System.out.println((j+1) + "" + (i+1) + " - jednosměrka");
                }
                
            }
                
        }
        
    }
    
}
