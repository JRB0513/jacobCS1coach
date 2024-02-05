// Jacob Bradley
import java.util.Scanner;
class squaTri
{
    public static void main(String args[])
    {
        Scanner cho = new Scanner(System.in);
        System.out.println("Choose 1 or 2. ");
        int numb = cho.nextInt();
        if (numb == 1){
            System.out.println("You've chosen the square. Please give the length of one side.");
            int leng = cho.nextInt();
            int ar = (leng * leng);
            System.out.println("The area of the square is " + ar);
            }
        else if (numb == 2){
            System.out.println("You've chosen the triangle. Please give the base. ");
            int bas = cho.nextInt();
            System.out.println("Please give the height. ");
            int hei = cho.nextInt();
            int are = (bas * hei);
            int a = (are / 2);
            System.out.println("The area of the triangle is " + a);
        }
        else{
            System.out.println("Sorry, but that is not an option.");
        }
    }
}