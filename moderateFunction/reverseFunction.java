// Jacob Bradley
import java.util.Scanner;
class reverseFunction
{
    public static void thisReverse(){
        Scanner yo = new Scanner(System.in);
        System.out.println("Enter a word: ");
        // This is the word that will be reversed
        String line = yo.nextLine();
        String rever = "";
        for (int i = line.length() - 1; i >= 0; i--){
            rever += line.charAt(i);
        }
        System.out.println(rever);
    }
    public static void main(String args[])
    {
        thisReverse();
    }
}