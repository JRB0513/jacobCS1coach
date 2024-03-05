// Jacob Bradley
import java.util.Scanner;
class reverseString
{
    public static void main(String args[])
    {
        Scanner joey = new Scanner(System.in);
        System.out.println("Enter name/phrase here: ");
        String bob = joey.nextLine();
        String rev = "";
        for(int len = bob.length() - 1; len >= 0; len--){
            rev += bob.charAt(len);
        }
        System.out.println("The word in reverse is " + rev);
        
    }
}