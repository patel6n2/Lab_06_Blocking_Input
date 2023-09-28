import java.util.Scanner;

public class CToFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter degrees in C: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = (9.0 / 5.0 * celsius) + 32;
                System.out.println(celsius + " degrees C is " + fahrenheit + " degrees F");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the temperature is " + trash);
                System.out.println("You must enter valid input values.");
            }
        } while (!done);
    }
}