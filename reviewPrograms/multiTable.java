// Jacob Bradley
import java.util.Scanner;
class multiTable
{
    public static void main(String args[])
    {
        Scanner quest = new Scanner(System.in);
        int dude = 1;
        System.out.println("Enter a number here: ");
        int hi = quest.nextInt();
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        for (int loo = 1; loo <= 15; loo++){
            int fin = (loo * hi);
            System.out.print(fin + " ");
        }
    }
}