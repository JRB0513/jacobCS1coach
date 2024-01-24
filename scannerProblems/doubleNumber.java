// Jacob Bradley
import java.util.Scanner;
class doubleNumber
{
    public static void main(String args[])
    {
        Scanner bob = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int num = bob.nextInt();
        int fin = (num * 2);
        System.out.println("If we double that number, we get " + fin);
    }
}