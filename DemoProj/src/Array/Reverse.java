package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Reverse {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=s.nextInt();
       

        int a[]=new int[n];

        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(a));

        System.out.println("Enter l");
        int l=s.nextInt();

        System.out.println("Enter r");
        int r=s.nextInt();

        while(l<r)
        {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;

            l++;
            r--;
        }
        System.out.println(Arrays.toString(a));
        //System.out.println("reverse array is "+ reverse);
    }
}



int firstlargest=Integer.MIN_VALUE;
int secondlargest=Integer.MIN_VALUE;

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

if(secondlargest==Integer.MIN_VALUE)
{
    System.out.println("second largest is not exist");
}
else
{
    System.out.println("first largest :"+firstlargest);
    System.out.println("second largest :"+secondlargest);
}