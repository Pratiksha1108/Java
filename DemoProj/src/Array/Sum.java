package Array;
import java.util.*;

public class Sum {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=s.nextInt();
        int sum=0;

        int a[]= new int[n];

        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
 
        System.out.println(Arrays.toString(a));
        for(int i=0;i<n;i++)
        {
            sum += a[i];
        }
        System.out.println("Sum is : "+sum);
    }
}
