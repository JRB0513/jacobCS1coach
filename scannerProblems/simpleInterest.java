// Jacob Bradley
import java.util.Scanner;
class simpleInterest
{
    public static void main(String args[])
    {
        Scanner mon = new Scanner(System.in);
        System.out.println("What's your principal balance? ");
        double prin = mon.nextDouble();
        System.out.println("What's your yearly interest rate? ");
        double rat = mon.nextDouble();
        double tim = (rat + 1);
        double fina = (tim * prin);
        System.out.println("In a year, your simple interest will be " + fina);
    }
}