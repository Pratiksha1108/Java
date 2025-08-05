package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSubArray {
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

        System.out.println("array is :"+Arrays.toString(a));
        
        System.out.println("Enter first index");
        int l=s.nextInt();
        System.out.println("Enter last index");
        int r=s.nextInt();
        
        
        
            while(l<r)
            {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;

                l++;
                r--;
            }
        
         System.out.println("reverse array is :"+Arrays.toString(a));
        }
}
