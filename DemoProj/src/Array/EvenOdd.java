package Array;
import java.util.*;

class EvenOdd
{
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

        System.out.println("Array is : "+Arrays.toString(a));

        int even=0,odd=0;

        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("Even count is :"+ even +"\n"+ "Odd count is : "+ odd);
    }
}