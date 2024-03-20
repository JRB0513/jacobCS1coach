// Jacob Bradley
import java.util.Scanner;
class fiveNum
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        int [] so = new int [5];
        int bob = 0;
        int fin = 0;
        int al = so.length - 1;
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < so.length; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            so[i] = num.nextInt();
        }
        System.out.println("You entered these numbers");
        for (int thing : so){
            System.out.println(thing);
        }
        for (int in = 0; in <= so.length - 1; in++){
            bob = al;
            fin = so[bob];
            al = al - 1;
            System.out.println(fin);
        }
    }
}