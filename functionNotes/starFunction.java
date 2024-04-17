// Jacob Bradley
import java.util.Scanner;
class starFunction
{
    public static void printThis(int numbr){
        for (int i = 0; i < numbr; i++){
            System.out.println("*");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int giv = word.nextInt();
        printThis(giv);
        System.out.println();
    }
}