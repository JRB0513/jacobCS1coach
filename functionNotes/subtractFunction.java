// Jacob Bradley
import java.util.Scanner;
class subtractFunction
{
    public static int subNum(int secnum, int firnum){
        return secnum - firnum;
    }
    public static void main(String args[])
    {
    Scanner giv = new Scanner(System.in);
    // The second number is the one being subtracted from
    System.out.println("Give me a first number: ");
    int fir = giv.nextInt();
    System.out.println("Give me a second number: ");
    int sec = giv.nextInt();   
    int sum = subNum(sec, fir);
    System.out.println("If you subtract " + fir + " from " + sec + " you get " + sum);
    }
}