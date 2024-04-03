// Jacob Bradley
import java.util.Scanner;
class minArray
{
    public static void main(String args[])
    {
        Scanner gru = new Scanner(System.in);
        int [] ray = new int [5];
        int next = (ray[0] + 1000);
        int le = 0;
        System.out.println("Enter 5 numbers.");
         for (int i = 0; i < ray.length; i++){
            System.out.println("Enter number " + (i + 1) + " : ");
            ray[i] = gru.nextInt();
        }
        for (int in = 0; in < ray.length; in++){
            if (ray[in] < next){
                le = ray[in];
                next = ray[in];
            }
        }
        System.out.println("The smallest number is " + le);
    }
}