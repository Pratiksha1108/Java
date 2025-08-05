package Array;

import java.util.*;

public class Max {
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

         int max=a[0];
         int min=a[0];

        System.out.println(Arrays.toString(a));   //print array
        
        
        //Maximun
        for(int i=0;i<n;i++)
        {
            if(a[i] > max)
            {
                max= a[i];
            }
        }
        System.out.println("Max is : "+max);

        //Minimum
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Min is : "+min);


    }
    
}
