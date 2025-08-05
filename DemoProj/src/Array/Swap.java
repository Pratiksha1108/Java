package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
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

        for(int i=0;i<n-1;i+=2)
        {  
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]= temp;

        }

        System.out.println(Arrays.toString(a));
     }

}
 