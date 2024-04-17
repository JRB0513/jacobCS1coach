// Jacob Bradley
import java.util.Scanner;
class helloFunction
{
    public static void greetUser(){
        Scanner word = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String thi = word.nextLine();
        System.out.println("Hello " + thi);
    }
    public static void main(String args[])
    {
        greetUser();
    }
}