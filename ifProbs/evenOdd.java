// Jacob Bradley
import java.util.Scanner;
class evenOdd
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("What's your favorite number? ");
        int thatnum = num.nextInt();
        if (thatnum % 2 == 0){
            System.out.println(thatnum + " is an even number.");
        }
        else{
            System.out.println(thatnum + " is an odd number.");
        }
    }
}