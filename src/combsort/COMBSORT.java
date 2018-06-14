/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combsort;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Mat Nguyen
 */
public class COMBSORT {
    int n;
    float[] x;
    public COMBSORT(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        COMBSORT cb = new COMBSORT();
        cb.input();
        cb.combsort();
        cb.printResult();
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x = new float[n];
        for(int i = 0; i < n; i++){
            x[i] = in.nextFloat();
        }
                
    }
    public void printResult(){
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i = 0; i < n; i++){
            System.out.print(df.format(x[i]) + " ");
        }
    }
    
    public  void combsort(){
        int g = n - 1;
        float shrink = 1.31f;
        //boolean sorted = false;
        while(g > 0)// && sorted == false)
        {
            g = (int) (g/shrink);
            g = Math.max(g, 0);
            
            for(int i = 0; i < n - g - 1 ; i++){
                if(x[i] > x[i  + g + 1]){
                    //Swap(x[i], x[i + g + 1]);
                    float tmp = x[i];
                    x[i] = x[i + g + 1];
                    x[i + g + 1] = tmp;
                    
                }
            }
//            if(g == 0){
//                sorted = true;
//                //break;
//            } 
        }
    }
}
