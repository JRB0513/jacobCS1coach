// Jacob Bradley
import java.util.Scanner;
class circleArea
{
    public static void main(String args[])
    {
        Scanner rad = new Scanner(System.in);
        System.out.println("What is the radius of a cricle? ");
        double radi = rad.nextDouble();
        double finrad = (radi * radi);
        double are = (Math.PI * finrad);
        System.out.println("The area of that circle is " + are);
    }
}