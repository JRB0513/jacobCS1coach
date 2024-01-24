// Jacob Bradley
import java.util.Scanner;
class addingNumbers
{
    public static void main(String args[])
    {
        Scanner yay = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int first = yay.nextInt();
        System.out.println("Give me another number: ");
        int second = yay.nextInt();
        int finale = (first + second);
        System.out.println("If we add those numbers together, we get " + finale );
    }
}