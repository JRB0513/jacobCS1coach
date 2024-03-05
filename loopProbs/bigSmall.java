// Jacob Bradley
import java.util.Scanner;
class bigSmall
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        int hu = 0;
        int sma = 0;
        int thi;
        System.out.println("Enter numbers. If you wish to stop, put in something that is not a number.");
        System.out.println("Enter in a number: ");
        boolean firstInput;
        firstInput = true;
        while (num.hasNextInt()){
            thi = num.nextInt();
            if (firstInput){
                hu = sma = thi;
                firstInput = false;
            } else {
                if (thi > hu){
                    hu = thi;
                }
                if (thi < sma){
                    sma = thi;
                }
            }
            System.out.println("Enter another number, or a non numeric character to stop.");
        }
        if (firstInput){
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number was " + hu);
            System.out.println("The smallest number was " + sma);
        }
    }
}