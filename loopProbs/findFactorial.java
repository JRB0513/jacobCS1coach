// Jacob Bradley
import java.util.Scanner;
class findFactorial
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter number here: ");
        int inut = ip.nextInt();
        for(int thi = inut - 1; thi >= 1; thi--){
            inut = (inut * thi);
        }
        System.out.println("The factorial is " + inut);
    }
}