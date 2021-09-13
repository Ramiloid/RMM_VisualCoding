/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrr_javase_lab01;

import static java.lang.Float.NaN;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MRR_JavaSE_Lab01 {

    private static float x;
    private static float b;
    private static float a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
                    Scanner ConsoleScan = new Scanner(System.in);
                    System.out.println("Type here your number A,please,God");
                float a = ConsoleScan.nextFloat();
                    System.out.println("Type here your number B,please,God");
                float b = ConsoleScan.nextFloat();
                    System.out.println("Type here your number X,please,God");
                float x = ConsoleScan.nextFloat();
        }
        catch(Exception e){
            System.out.println("Something,went wrong try again!");
        }
        
        try{
                if(x<=4){
                    float y = (float) (Math.pow(a, 2) / Math.pow(x,2))+6*x;
                    if(Float.isNaN(y)){
                        throw new ArithmeticException("illegal double value: " + y);
                    }else{
                        System.out.format("Well,look at that y =  %.2f",y,"%n");
                    }
                }
                if(x>4){
                    float y = (float) (Math.pow(b, 2)* Math.pow(4+x, 2));
                    if(Float.isNaN(y)){
                        throw new ArithmeticException("illegal double value: " + y);
                    }else{
                        System.out.format("Well,look at that y =  %.2f",y,"%n");
                }
            }
        }
        catch(ArithmeticException e){
                    System.out.println("We can't find any solution yet");
        }    
            
            
            
        
       
           // System.out.println("Something went wrong, Bro. Try Again. Might u set wrong charachters?");
      
   
    
    }
}
