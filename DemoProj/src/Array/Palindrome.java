package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
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

      boolean isPalindrome = true;

        int i=0;
        int j=n-1;

        while(i<j)
        {
            if(a[i]!=a[j])
            { 
                isPalindrome=false;
                break;

            }
            i++;
            j--;
        }
        if(isPalindrome)
        {
        System.out.println("Is a palindome number "+Arrays.toString(a));
        }
        else
        {
            System.out.println("Is not a palindome  "+Arrays.toString(a));
        }

    }
    
}
