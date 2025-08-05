package Array;
import java.util.*;


public class Access {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Array is : ");
        

        System.out.println(Arrays.toString(arr));
        
        

    }
    
}
