// Jacob Bradley
import java.util.Scanner;
class ageCount
{
    public static void main(String args[])
    {
        Scanner ag = new Scanner(System.in);
        System.out.println("How old are you? ");
        int ager = ag.nextInt();
        if (ager >= 18)
            System.out.println("You can vote.");
        if (ager == 17)
            System.out.println("You can learn to drive.");
        if (ager == 16)
            System.out.println("You can buy a lottery ticket.");
        if (ager < 16)
            System.out.println("You can go Trick-or-Treating.");          
    }
}    