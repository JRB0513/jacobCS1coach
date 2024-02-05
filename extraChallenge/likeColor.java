// Jacob Bradley
import java.util.Scanner;
class likeColor
{
    public static void main(String args[])
    {
        Scanner col = new Scanner(System.in);
        System.out.println("What's your favorite color? ");
        String fav = col.nextLine();
        if (fav.equals("red")){
            System.out.println("I also like " + fav);
        }
        else if (fav.equals("Red")){
            System.out.println("I also like " + fav);
        }
        else if (fav.equals("RED")){
            System.out.println("I also like " + fav);
        }    
        else{
            System.out.println("I don't like " + fav + " I like red.");
        }
    }
}