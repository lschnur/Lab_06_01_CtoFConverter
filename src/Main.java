import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC= 0;
        double tempF= 0;

        System.out.print("What is the temperature? ");


        if(in.hasNextDouble())
        {
            tempC = in.nextDouble();
            tempF= (tempC *9/5) + 32;
            System.out.println("The temperature in Fahrenheit is " + tempF);
        }
        else
        {
            System.out.println("You have entered an invalid temperature");
        }


    }
}