/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Airfare { 
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int distance, cls, ec, bc;
        float tf = 0, f = 0;
        
         ec = 250;
         bc = 500;
        
        System.out.print("Distance(km): ");
        distance = sc.nextInt();
        
        System.out.print("Class (1/2): ");
        cls = sc.nextInt();
       
       if (cls == 1){
           f = ec*distance;
       } else if (cls == 2) {
           f = bc*distance;
       } else {
           System.out.print(":Invalid Class.");
           sc.close();
       }
        if (distance > 1000){
            tf = f * 0.9f;
        }else{
            tf = f;
        }
       System.out.print("Total fare: " + tf);
       sc.close();
        
        
    }
    
}

