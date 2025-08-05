import java.util.Scanner;

public class Pattern15 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=s.nextInt();

        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
