// Jacob Bradley
import java.util.Scanner;
class ifCount
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("What number are you thinking of? Enter here: ");
        int givnum = num.nextInt();
        if (givnum < 10)
            System.out.println("Too low.");
        else if (givnum > 20)
            System.out.println("Too high.");
        else
            System.out.println("Correct.");
    }
}