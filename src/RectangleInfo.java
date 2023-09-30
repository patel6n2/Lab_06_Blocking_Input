import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter the rectangle width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if (width >= 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println(width + " is negative value; out of range.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the width is " + trash);
                System.out.println("You must enter valid input values.");
            }
        } while (!done);
        do
        {
            done = false;
            System.out.print("Enter the rectangle height: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                if (height >= 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println(height + " is negative value; out of range.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the height is " + trash);
                System.out.println("You must enter valid input values.");
            }
        } while (!done);
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagonal is " + diagonal);
    }
}