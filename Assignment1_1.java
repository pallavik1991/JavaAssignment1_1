/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Vaio
 */
public class Assignment1_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b=sc.nextInt();
        while(b!=0)
        {
            int carry=(a&b);
            a=a^b;
            b=carry<<1;
        }
        
        System.out.println("Sum of 2 numbers: "+a);
    }
    
}
