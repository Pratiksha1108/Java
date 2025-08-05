package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
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
        
           int index=0;

        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[index]=a[i];
                index++;
            }
        }

        
        while(index<n)
        {
            a[index]=0;
            index++;
        }
        System.out.println("array is :"+Arrays.toString(a));
    }
}
