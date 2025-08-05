package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
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

        int firstlargest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]>firstlargest)
            {
                secondlargest=firstlargest;
                firstlargest=a[i];
            }
            else if(a[i]>secondlargest && a[i]!=firstlargest)
            {
                secondlargest=a[i];
            }
        }

        System.out.println("firstlargest is : "+firstlargest);
        if(secondlargest==Integer.MIN_VALUE)
        {
            System.out.println(" second largest is not exist");
        }
        else
        {
            //stem.out.println("firstlargest is : "+firstlargest);
            System.out.println("secondlargest is : "+secondlargest);
        }

    }
}
