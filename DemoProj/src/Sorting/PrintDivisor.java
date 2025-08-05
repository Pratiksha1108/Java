import java.util.*;

import java.util.Scanner;

public class PrintDivisor {

    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("enter n");

        for(int i;i<=n;i++)
        {
            if(n%i==0)
            System.out.println(i);
        }

    }

    
}
