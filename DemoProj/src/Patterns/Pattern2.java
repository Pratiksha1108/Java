import java.util.*;
public class Pattern2 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
