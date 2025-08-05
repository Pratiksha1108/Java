package Digit_Based;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter n :");
        int n=s.nextInt();
        int even=0,odd=0;
        
        while(n>0)
        {
            int digit=n%10;
            if(digit%2==0)
            {
                even=even+digit;
            }
            else
            {
                odd=odd+digit;
            }
            n=n/10;
        }

        System.out.println("Even sum is : "+even);
        System.out.println("Odd sum is : "+odd);

    }
}