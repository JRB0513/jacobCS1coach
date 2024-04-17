// Jacob Bradley
import java.util.Scanner;
class multiFunction
{
    public static int multiNum(int firnum, int secnum){
        return firnum * secnum;
    }
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fir = num.nextInt();
        System.out.println("Enter second number: ");
        int sec = num.nextInt();
        int sum = multiNum(fir, sec);
        System.out.println(fir + " times " + sec + " equals " + sum);
    }
}