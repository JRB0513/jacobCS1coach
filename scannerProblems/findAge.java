// Jacob Bradley
import java.util.Scanner;
class findAge
{
    public static void main(String args[])
    {
        Scanner whoo = new Scanner(System.in);
        System.out.println("What year were you born? Enter here: ");
        int year = whoo.nextInt();
        int age = (2024 - year);
        System.out.println("If it's 2024, you're " + age + " years old.");
    }
}