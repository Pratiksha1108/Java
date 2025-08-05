package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotatebyOne {
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


        //Left Rotate
        int temp=a[0];

        for(int i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }

        a[n-1]=temp;

        System.out.println("Left Rotate by 1 : "+Arrays.toString(a));

        //Right rotate

        int temp1=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp1;
        System.out.println("Right rotate by 1 : "+Arrays.toString(a));
    
} }

