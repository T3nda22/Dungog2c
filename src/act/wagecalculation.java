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
public class wagecalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        System.out.print("Enter total hours worked this week: ");
        int hoursWorked = sc.nextInt();

        double grossWage = hourlyRate * hoursWorked;
        double sssContribution = grossWage * 0.10;
        double netWage = grossWage - sssContribution;

        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Weekly Wage: " + grossWage);
        System.out.println("SSS Contribution (10%): " + sssContribution);
        System.out.println("----------------------------------------");
        System.out.println("Net Weekly Wage: " + netWage);
    }
}
