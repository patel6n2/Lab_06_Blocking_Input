import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       double gallons = 0;
       double milesPerGallon = 0;
       double pricePerGallon = 0;
       double costPer100Miles = 0;
       double totalDistance = 0;
       String trash = "";
       boolean done = false;
       do
       {
           System.out.print("Enter the number of gallons: ");
           if(in.hasNextDouble())
           {
               gallons = in.nextDouble();
               in.nextLine();
               if(gallons >= 0)
               {
                   done = true;
               }
               else
               {
                   System.out.println(gallons + " is negative value; out of range.");
               }
           }
           else
           {
               trash = in.nextLine();
               System.out.println("You said the number of gallons is " + trash);
               System.out.println("You must enter valid input values.");
           }
       } while (!done);
       do
       {
           done = false;
           System.out.print("Enter the miles per gallon: ");
           if(in.hasNextDouble())
           {
               milesPerGallon = in.nextDouble();
               in.nextLine();
               if(milesPerGallon >= 0)
               {
                   done = true;
               }
               else
               {
                   System.out.println(milesPerGallon + " is negative value; out of range.");
               }
           }
           else
           {
               trash = in.nextLine();
               System.out.println("You said the miles per gallon is " + trash);
               System.out.println("You must enter valid input values.");
           }
       } while (!done);
       do
       {
           done = false;
           System.out.print("Enter the price per gallon: ");
           if(in.hasNextDouble())
           {
               pricePerGallon = in.nextDouble();
               in.nextLine();
               if(pricePerGallon >= 0)
               {
                   done = true;
               }
               else
               {
                   System.out.println(pricePerGallon + " is negative value; out of range.");
               }
           }
           else
           {
               trash = in.nextLine();
               System.out.println("You said the price per gallon is " + trash);
               System.out.println("You must enter valid input values.");
           }
       } while (!done);
       costPer100Miles = (pricePerGallon / milesPerGallon) * 100.0;
       totalDistance = gallons * milesPerGallon;
       System.out.printf("The cost per 100 miles is $%.2f\n", costPer100Miles);
       System.out.println("The car can go " + totalDistance + " miles with the gas in the tank");
    }
}
