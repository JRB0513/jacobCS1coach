// Jacob Bradley
import java.util.Scanner;
class leapYear
{
    public static void main(String args[])
    {
        Scanner yea = new Scanner(System.in);
        System.out.println("What year is it? ");
        int givyea = yea.nextInt();
        if (givyea % 4 == 0){
            System.out.println("It's a leap year."); 
        }
        else{
            System.out.println("It's not a leap year.");
        }
    }
}