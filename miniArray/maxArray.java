// Jacob Bradley
import java.util.Scanner;
class maxArray
{
    public static void main(String args[])
    {
        Scanner ar = new Scanner(System.in);
        int [] nums = new int [5];
        int fin = 0;
        int gre = 0;
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i + 1) + " : ");
            nums[i] = ar.nextInt();
        }
        for (int in = 0; in < nums.length; in++){
            if (nums[in] > fin){
                gre = nums[in];
            }
            fin = nums[in];
        }
        System.out.println("The greatest number in the array is " + gre);
    }
}