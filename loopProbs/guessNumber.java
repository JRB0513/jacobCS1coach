// Jacob Bradley
import java.util.Scanner;
class guessNumber
{
    public static void main(String args[])
    {
        Scanner numb = new Scanner(System.in);
        int dude = (int) (Math.random() * 10 + 1);
        System.out.println("Guess a number between 1 and 10: ");
        while (numb.hasNextInt()){
        int gu = numb.nextInt();
        System.out.println("Guess a number between 1 and 10: ");
            if (gu == dude){
                System.out.println("Good job!");
                break;
            }
            else if (gu < dude){
                System.out.println("Too low.");
            }
            else {
                System.out.println("Too high.");
            }
        }
    }
}