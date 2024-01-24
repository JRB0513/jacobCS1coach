// Jacob Bradley
import java.util.Scanner;
class celsius
{
    public static void main(String args[])
    {
        Scanner cel = new Scanner(System.in);
        System.out.println("What's the temperature in farenheit? Enter here: ");
        double farnum = cel.nextDouble();
        double celnum = (farnum - 32);
        double divnum = (0.5555);
        double finnum = (celnum * divnum);
        System.out.println("It's " + finnum + " degrees celsius.");
        System.out.println("What temperature is it now in celsius? Enter here: ");
        double celsinum = cel.nextDouble();
        double mulnum = (celsinum * 1.8);
        double farenum = (mulnum + 32);
        System.out.println("The new temperature in farenheit is " + farenum);
    }
}