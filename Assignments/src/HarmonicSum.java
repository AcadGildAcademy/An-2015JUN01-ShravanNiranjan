import java.util.*;
public class HarmonicSum
{
    static int n; static double sum=0,num;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n");
        n=sc.nextInt();
        double p=SumR2L(n);
        sum=0;
        double q=SumL2R(n);
        sum=0;
        System.out.println("Sum from left to right : "+q);
        System.out.println("Sum from right to left : "+p);
        System.out.println("Difference : "+(q-p));
    }

    static double SumR2L(int x)
    {
        for (double i=1; i<=x; i++)
        {
            num=(1/i);
            sum=sum+num;
        }
        return sum;

    }

    static double SumL2R(int x)
    {
        for(double i=x; i>0;i--)
        {
            num=(1/i);
            sum=sum+num;
        }
        return sum;

    }
}