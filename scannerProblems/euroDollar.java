// Jacob Bradley
import java.util.Scanner;
class euroDollar
{
    public static void main(String args[])
    {
        Scanner dol = new Scanner(System.in);
        System.out.println("How much money do you want to bring to Europe in dollars? ");
        double dolla = dol.nextDouble();
        double eur = (dolla * 0.92);
        System.out.println("That's worth " + eur + " euros.");
    }
}