package Maths;

import java.io.IOException;
import java.util.Scanner;

public class count {
    public static void main(String args[]) throws IOException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter digit");
        int n=s.nextInt();
        
        int cnt=0;
        while(n>0)
        {
        int digit=n%10;
        cnt=cnt+1;
        n=n*10;  
        }
        System.out.println("Count is"+ cnt);
    }
    
}
