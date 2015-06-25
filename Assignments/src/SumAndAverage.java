import java.util.*;
public class SumAndAverage
{
    static int ul;//to store input for upper limit
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upper limit :");
        ul=sc.nextInt();
        System.out.println(sum(ul));
        System.out.println(avg(ul));
    }
    
    static int sum(int x)//x is a parameter to store upper limit
    {
        int sum=0; 
        for (int i=0; i<=x; i++)
        {
            sum=sum+i;
        }
        return sum; 
    }
    
    static double avg(int x)
    {
        double avg;
        double sum=0;
        for(int i=0;i<=x; i++)
        {
            sum=sum+i;
        }
        avg=sum/x;
        return avg;
    }
}
            
            