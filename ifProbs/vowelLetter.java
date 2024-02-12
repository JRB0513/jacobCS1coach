// Jacob Bradley
import java.util.Scanner;
class vowelLetter
{
    public static void main(String args[])
    {
        Scanner let = new Scanner(System.in);
        System.out.println("What's your favorite letter? ");
        String favlet = let.nextLine();
        if (favlet.equals("a")){
            System.out.println("That letter is a vowel.");
        }
        else if (favlet.equals("e")){
            System.out.println("That letter is a vowel.");
        }
        else if (favlet.equals("i")){
            System.out.println("That letter is a vowel.");
        }
        else if (favlet.equals("o")){
            System.out.println("That letter is a vowel.");
        }
        else if (favlet.equals("u")){
            System.out.println("That letter is a vowel.");
        }
        else {
            System.out.println("That's a consonant.");
        }        
    }
}