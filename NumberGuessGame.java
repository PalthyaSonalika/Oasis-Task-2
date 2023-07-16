import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void Start_Game()
    {   int i;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int rn=r.nextInt(100)+1;
        System.out.println("A Number Between 1 to 100");
        for(i=1;i<=5;i++)
        { 
            System.out.println("Guess The Number:");
            int num=sc.nextInt();
            if(num>rn)
            {
                int g=num-rn;
                if(g>=20)
                {
                    System.out.println("Ohhh!! Too High :: Try Again");
                }
                else
                {
                    if(g<5)
                    {
                        System.out.println("Too Close:: Little Lower");
                    }
                    else
                    {
                        System.out.println("Guess a number lower Than Previous");
                    }
                }
                System.out.println("You Have " + (5-i) + " More Tries Remaining");
            }
            else if(num<rn)
            {
                int g=rn-num;
                if(g>=20)
                {
                    System.out.println("Ohhh!! Too Low :: Try Again");
                }
                else
                {
                    if(g<5)
                    {
                        System.out.println("Too Close:: Little Higher");
                    }
                    else
                    {
                        System.out.println("Guess a number Higher Than Previous");
                    }
                }
                System.out.println("You Have " + (5-i) + " More Tries Remaining");
            }
            else
            {
                System.out.println("Congratulations!!! You Have Guessed the Correct Number");
                System.out.println("You Guessed in " + i +" Tries");
                System.out.println("Your Score is: " + ((5-i)*20));
                break;
            }
        }
        if(i>5)
        {
            System.out.println("You Have Exceeded Maximum Tries:(");
            System.out.println("The Number is: " + rn);
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int ch;
        while(true){
        System.out.println("1.Start Game");
        System.out.println("2.Exit");
        ch=Sc.nextInt();
        switch (ch) {
            case 1:
                Start_Game();
                break;
            
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Enter Correct Entry");
                break;
        }
    }
    }
}
