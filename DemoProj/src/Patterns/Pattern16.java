import java.util.Scanner;

public class Pattern16 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print(i+" ");   
            }
            System.out.println();
        }
    }
    
}
