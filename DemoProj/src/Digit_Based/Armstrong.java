package Digit_Based;
import java.util.Scanner;


public class Armstrong {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter n :");
        int n=s.nextInt();
        int armstrong=0;
        int original =n;

        while(n>0)
        {
            int digit = n%10;
            armstrong = armstrong + digit * digit * digit;
            n=n/10;
        }

        if(original ==armstrong)
        {
        System.out.println("Yes its a Armstrong number is : " + armstrong);
        }
        else
        {
        System.out.println("Not a Armstrong number is : " + armstrong);
        }
    }
    
}
