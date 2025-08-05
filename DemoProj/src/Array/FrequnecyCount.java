package Array;

import java.util.*;

public class FrequnecyCount {
    
    public static void main(String args[])
{
    Scanner s =new Scanner(System.in);
    System.out.println("Enter n :");
    int n=s.nextInt();

    int a[]=new int[n];

    System.out.println("Enter array elements :");
    for(int i=0;i<n;i++)
    {
         a[i]=s.nextInt();
    }

    System.out.println("Array is : "+Arrays.toString(a));


    //First way 
    // boolean visited[]=new boolean[n];
    // for(int i=0;i<n;i++)
    // {
    //     if(visited[i]==true)
    //       continue;

    //       int cnt=1;  // intially count is 1 

    //       for(int j=i+1;j<n;j++)
    //       {
    //         if(a[i]==a[j])
    //         {
    //             visited[j]=true;
    //             cnt++;
    //         }
    //       }
    //       System.out.println(a[i] + " occurs " + cnt + " times");
    // }


    //Second way
    HashMap<Integer, Integer> freq = new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(freq.containsKey(a[i]))
        {
            freq.put(a[i],freq.get(a[i])+1);
        }
        else
        {
            freq.put(a[i],1);
        }
    }
    System.out.println("Frequency is occur " +freq);

}
}
