package Sorting;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter list :");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        

        System.out.println("Array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }  
    }

   
       
    }

    
    
}
