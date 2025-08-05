package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[])
{
    Scanner s =new Scanner(System.in);
    System.out.println("Enter n :");
    int n=s.nextInt();

    int a[]=new int[n];

    System.out.println("Enter array elements :");
    for(int i=0;i<n;i++)
    {
         a[i]=s.nextInt();
    }

    System.out.println("Array is : "+Arrays.toString(a));

    int temp[]=new int[n];
    int k=0;

   // boolean isDup=false;

    for(int i=0;i<n;i++)
    {
        boolean isDup=false;

         for(int j=0;j<k;j++)
         {
            if(a[i]==temp[j])
            {
                isDup=true;
                break;
            }
         }
         if(!isDup)
         {
            temp[k]=a[i];
            k++;
         }

    }

    System.out.println("Removed duplicates :");
    for(int i=0;i<k;i++)
    {
         System.out.println(temp[i]+"  "+"\n"); 
    }
    
}
}
