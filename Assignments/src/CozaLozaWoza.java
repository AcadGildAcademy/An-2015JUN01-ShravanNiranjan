public class CozaLozaWoza
{
    public static void main(String args[])
    {
        for(int i=1; i<111; i++)
        {
            if(i%3==0&&i%5!=0&&i%7!=0)
            {
                System.out.print("Coza ");
            }

            if(i%5==0&&i%3!=0&&i%7!=0)
            {
                System.out.print("Loza ");
            }

            if(i%7==0&&i%5!=0&&i%3!=0)
            {
                System.out.print("Woza ");
            }

            if(i%7==0&&i%5==0&&i%3!=0)
            {
                System.out.print("LozaWoza ");
            }

            if(i%7==0&&i%5!=0&&i%3==0)
            {
                System.out.print("CozaWoza ");
            }

            if(i%7!=0&&i%5==0&&i%3==0)
            {
                System.out.print("CozaLoza ");
            }

            if(i%7==0&&i%5==0&&i%3==0)
            {
                System.out.print("CozaLozaVoza ");
            }

            if((i-1) %11==0)
            {
                System.out.println();
            }

            else 
            {
                System.out.print(i+" ");
            }
        }
    }
}
 