import java.util.Scanner;

public class Pattern1 {

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=s.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}