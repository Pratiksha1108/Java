package Digit_Based;

import java.util.Scanner;

public class Count {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter n :");
        int n=s.nextInt();
        int cnt=0;

        while(n>0)
        {
            int digit =n%10;
            cnt++;
            n=n/10;
        }
    System.out.println("Count is : "+cnt);
    }
}
