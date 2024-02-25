// Jacob Bradley
import java.util.Scanner;
class thisTri
{
    public static void main(String args[])
    {
        Scanner pic = new Scanner(System.in);
        System.out.println("Choose 3 angles of a triangle. What's the first angle? ");
        int firan = pic.nextInt();
        System.out.println("What's the second angle? ");
        int secan = pic.nextInt();
        System.out.println("What's the third angle? ");
        int thian = pic.nextInt();
        int ans = (firan + secan + thian);
        if (firan == 60 && secan == 60 && thian == 60){
            System.out.println("That triangle is equilateral.");
        }
        else if (firan == secan){
            System.out.println("That triangle is an isoceles.");
        }
        else if (secan == thian){
            System.out.println("That triangle is an isoceles.");
        }
        else if (thian == firan){
            System.out.println("That triangle is an isoceles.");
        }
        else if (ans != 180){
            System.out.println("That's not a triangle.");
        }
        else {
            System.out.println("That triangle is scalene.");
        }
    }
}