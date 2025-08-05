package Digit_Based;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter n :");
        int n=s.nextInt();
        int sum=0;
        int original=n;
    
     
        
            while(n>0)
            {
                int digit=n%10;
                int fact=1;
                for(int i=1;i<=digit;i++)
                {
                    fact = fact *i;
                }
                sum=sum+fact;
                n=n/10;
            }
        
        if(original==sum)
        {
        System.out.println("It is a strong number :"+sum);
        }
        else
        {
        System.out.println("It is not a strong number :"+sum);  
        }
    }
    
}

