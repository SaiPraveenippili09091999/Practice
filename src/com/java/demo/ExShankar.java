package com.java.demo;

import java.util.Scanner;
public class ExShankar
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println(" Enter No of rows ");
         
        int rows = sc.nextInt();
         
        System.out.println("Pattern :");
         
         
        for (int i = 1; i <= rows; i++) 
        {
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
             
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j+" "); 
            } 
             
            System.out.println(); 
        } 
         
         
        for (int i = rows-1; i >= 1; i--) 
        {
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        
    }
}
