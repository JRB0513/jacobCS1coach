// Jacob Bradley
import java.util.Scanner;
class arraySum
{
    public static void main(String args[])
    {
        Scanner sel = new Scanner(System.in);
        int [] nums = new int [5];
        int tog = nums.length - 1;
        int fin = 0;
        int [] ar = new int [5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i + 1) + " : ");
            nums[i] = sel.nextInt();
        }
        for (int in = 0; in <= nums.length - 1; in++){
            fin = (nums[in] % 2);
             if (fin == 0){
                ar[in] = nums[in];
            }
            if (ar[in] != 0){
            System.out.println("The even number is " + ar[in]);
            }
        }
    }
}