/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act;

import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String name;
            int sci, history, math, soc, arts;
            int total;
            double percentage;
            String remarks = null;
            
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter marks in Science: ");
            sci = sc.nextInt();
            System.out.print("Enter marks in History: ");
            history = sc.nextInt();
            System.out.print("Enter marks in Math: ");
            math = sc.nextInt();
            System.out.print("Enter marks in Soc: ");
            soc = sc.nextInt();
            System.out.print("Enter marks in arts: ");
            arts = sc.nextInt();
            total = sci + history + math + soc + arts;
            percentage = total / 5.0;
            
            if(percentage <= 70){
                remarks = "Fail";
            }else if (percentage <= 75){
                remarks = "Poor";
            }else if (percentage <= 80){
                remarks = "Fair";
            }else if (percentage <= 85){
                remarks = "Good";
            }else if (percentage <= 90){
                remarks = "Excellent";
            }   
            System.out.print("\nTotal Marks: " + total);
            System.out.printf("\nTotal percentage: %.2f", percentage);
            System.out.print("\nRemarks: " + remarks);
            if (percentage < 70) {
                System.out.println("\nTry Again " + name + ".");
            } else {
                System.out.println("\nCongrats " + name + " you Passed.");
            }
        }
    }
    
