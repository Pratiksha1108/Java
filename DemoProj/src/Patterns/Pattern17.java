import java.util.Scanner;

public class Pattern17 {

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=s.nextInt();

        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //star(*)
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
  
    }
    
}
