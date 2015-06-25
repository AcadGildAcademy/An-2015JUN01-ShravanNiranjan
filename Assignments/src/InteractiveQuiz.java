import java.util.*;
public class InteractiveQuiz
{
    public static void main(String args[])
    {
        int score=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the capital of India?"+"\n"+"1. New Delhi"+"\n"+"2. Dhaka"+"\n"+"3. Karachi");
        if(sc.nextInt()==1)
        {
            score=score+1;
            System.out.println("Correct!"+"\n");    
        }
        else
        {
            System.out.println("Wrong!"+"\n");
        }        
        System.out.println("Can you store the value of 'pig' in Int datatype?"+"\n"+"1. Yes"+"\n"+"2. No");
        if(sc.nextInt()==2)
        {
            score=score+1;
            System.out.println("Correct!"+"\n");    
        }
        else
        {
            System.out.println("Wrong!"+"\n");
        }        
        System.out.println("What is the result of (25*26)/13?"+"\n"+"1. 65"+"\n"+"2. 100"+"\n"+"3. 50");
        if(sc.nextInt()==3)
        {
            score=score+1;
            System.out.println("Correct!"+"\n");    
        }
        else
        {
            System.out.println("Wrong!"+"\n");
        }  
        System.out.println("Your score is : "+score);

    }
}
    