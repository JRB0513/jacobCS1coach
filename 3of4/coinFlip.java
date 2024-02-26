// Jacob Bradley
import java.util.Scanner;
class coinFlip
{
    public static void main(String args[])
    {
        Scanner fli = new Scanner(System.in);
        System.out.println("I'll flip a coin. Heads or Tails? 1 for heads, 2 for Tails; ");
        int cho = fli.nextInt();
        int sig = (int) (Math.random() * 2);
        System.out.println("It was " + sig);
        if (sig == cho){
            System.out.println("You win!");
        }
        else if (sig == 0){
            System.out.println("Wait, what? Oh, dropped my coin.");
        }
        else{
            System.out.println("Sorry, you lose.");
        }
    }
}