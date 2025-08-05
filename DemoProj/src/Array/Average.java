package Array;

import java.util.*;

public class Average {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("enter n :");
        int n=s.nextInt();
        int a[]=new int[n];
        int sum=0;

         System.out.print("enter array elements:");
         for(int i=0;i<n;i++)
         {
            a[i]=s.nextInt();
            sum= sum+a[i];
         }

         System.out.println(Arrays.toString(a));
        
         

         double avg=(double) sum/n;
         System.out.println("Sum is :"+sum);
         System.out.print("Average is :"+avg);
   
   
   
   
        }
}
    

