import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter a measurement in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                if (meters >= 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println(meters + " is negative value; out of range.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the measurement in meters is " + trash);
                System.out.println("You must enter valid input values.");
            }
        } while (!done);
        miles = meters * 0.000621371;
        feet = miles * 5280;
        inches = feet * 12;
        System.out.println("The measurement " + meters + " meters is equivalent to " + miles + " miles, or " + feet + " feet, or " + inches + " inches.");
    }
}