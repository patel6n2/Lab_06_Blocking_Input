import java.util.Scanner;
import java.util.Random;
public class HighOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int val = gen.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Guess the number [1 - 10]: ");
            if (in.hasNextDouble())
            {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10)
                {
                    done = true;
                }
                else
                {
                    System.out.println(guess + " is not in range [1 - 10]");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number!");
            }
        } while (!done);
        System.out.println("The random number was " + val);
        if (guess > val)
        {
            System.out.println("Your guess was high.");
        }
        else if (guess < val)
        {
            System.out.println("Your guess was low.");
        }
        else
        {
            System.out.println("Your guess was on the money!");
        }
    }
}