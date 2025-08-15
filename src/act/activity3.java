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
public class activity3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        
        
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        
        if (num == 0){
            System.out.print("\nInputted number is Zero");
        } else if (num < 0){
            System.out.print(num+ "is a negative number");  
        } else {
            System.out.print(num+ "is a positive number");
    }
        }
        
            }
