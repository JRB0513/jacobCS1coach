// Jacob Bradley
import java.util.Scanner;
class diceRoll
{
    public static void main(String args[])
    {
        System.out.println("Slay the monster to gain it's treasure.");
        int health = 100;
        while (health >= 1){
        int roll = (int) (Math.random() * 20 + 1);
        health = (health - roll);
        System.out.println("You dealt " + roll + " damage to the monster.");
        System.out.println("The monster has " + health + " health left.");
        }
    }
}