package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=s.nextInt();

        int a[]=new int[n];

        System.out.println("Enter array :");
        for(int i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }

        System.out.println(Arrays.toString(a));
        
        boolean isSort =true;
     for(int i=0;i<n-1;i++)
     {
        if(a[i]>a[i+1])
        {
           isSort = false;
           break;
        }
     }

     if(isSort)
     {
        
        System.out.println("Array is sorted");
     }
     else
     {
        System.out.println("Array is not sorted");
     }
    }
}









