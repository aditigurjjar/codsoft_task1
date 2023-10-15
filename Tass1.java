import java.util.Scanner;
class Range
{
    public int generate(int max,int min)
    {
        return (int) (Math.random()*(max - min +1)+min);
    }
}
public class Tass1
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        Range r=new Range();
        int totalAttempts=0;
        int win=0;

        while(true)
        {
            System.out.println("Enter the maximum number");
            int max=s.nextInt();
             System.out.println("Enter the minimum number");
            int min=s.nextInt();
            s.nextLine();
            
            int num=r.generate(max, min);
            int attempts=0;

            while(true)
            {
                System.out.println("Guess a number between "+min+" and "+max);
                int no=s.nextInt();
                attempts++;

                if(no>num)
                {
                    System.out.println("It's Greater Number");
                }
                else if(no<num)
                {
                     System.out.println("It's Lesser Number");
                }
                else
                {
                    System.out.println("Correct Number Guess");
                    win++;
                    break;
                }
            }
            totalAttempts +=attempts;
            System.out.println("Attempts="+attempts);
            System.out.println("Win="+win);

            double winRate=(double)win/totalAttempts*100;
			System.out.println("Your winrate is \n"+winRate);
            System.out.println(" Want to play again(yes/no)");
            String playAgain=s.next();
            if(!playAgain.equalsIgnoreCase("yes"))
            {
                s.close();
                System.exit(0);
            }
            s.nextLine();
        }
    }
}