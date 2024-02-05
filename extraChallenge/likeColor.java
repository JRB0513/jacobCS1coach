// Jacob Bradley
import java.util.Scanner;
class likeColor
{
    public static void main(String args[])
    {
        Scanner col = new Scanner(System.in);
        System.out.println("What's your favorite color? ");
        String fav = col.nextLine();
        if (fav == "red"){
            System.out.println("I also like " + fav);
        }
        else if (fav == "Red"){
            System.out.println("I also like " + fav);
        }
        else if (fav == "RED"){
            System.out.println("I also like " + fav);
        }    
        else{
            System.out.println("I don't like " + fav + " I like red.");
        }
    }
}