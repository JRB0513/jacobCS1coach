// Jacob Bradley
import java.util.Scanner;
class arraySum
{
    public static void main(String args[])
    {
        Scanner sel = new Scanner(System.in);
        double [] nums = new double [5];
        int tog = nums.length;
        double fin = 0;
        double don = 0;
        double al = 0;
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            nums[i] = sel.nextDouble();
        }
        for (int in = 0; in <= nums.length - 1; in++){
            fin = nums[tog - in - 1];
            don = (don + fin);
            System.out.println(don);
        }
        al = (don / tog);
        System.out.println(al);
    }
}