// Jacob Bradley
import java.util.Scanner;
class rockPaper
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Let's play rock paper scissors.");
        System.out.println("Put in a number. 1 for Rock, 2 for Paper, 3 for Scissors");
        int choi = ob.nextInt();
        int com = (int) (Math.random() * 3);
        System.out.println("I chose " + com);
        if (choi == com){
            System.out.println("We have a tie!");
        }
        else if (choi == 2 && com == 1){
            System.out.println("You win!");
        }
        else if (choi == 3 && com == 2){
            System.out.println("You win!");
        }
        else if (choi == 1 && com == 3){
            System.out.println("You win!");
        }
        else if (choi == 1 && com == 2){
            System.out.println("You lose.");
        }
        else if (choi == 2 && com == 3){
            System.out.println("You lose.");
        }
        else if (choi == 3 && com == 1){
            System.out.println("You lose.");
        }
        else if (com == 0){
            System.out.println("I chose shoot. Shoot always wins!");
        }
    }
}
