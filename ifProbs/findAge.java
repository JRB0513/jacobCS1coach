// Jacob Bradley
import java.util.Scanner;
class findAge
{
    public static void main(String args[])
    {
        Scanner ag = new Scanner(System.in);
        System.out.println("How old are you?");
        int agnum = ag.nextInt();
        if (agnum < 0){
            System.out.println("That is not a real answer, please try again.");
        }
        else if (agnum < 13){
            System.out.println("You are a child.");
        }
        else if (agnum < 18){
            System.out.println("You're a teenager.");
        }
        else if (agnum < 50){
            System.out.println("You're an adult.");
        }
        else if (agnum < 120){
            System.out.println("You're a senior citizen.");
        }
        else{
            System.out.println("You're dead. (If this is somehow you're actual age, congratulations.)");
        }
    }
}