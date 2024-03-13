// Jacob Bradley
import java.util.Scanner;
class integerSum
{
    public static void main(String args[])
    {
        Scanner qu = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        String giv = qu.nextLine();
        int moo = 0;
        int ja = 0;
        int id = giv.length();
        char nub = 'a';
        for (int i = 0; i <= giv.length() - 1; i++){
            nub = giv.charAt(id - 1);
            moo = nub - 48;
            ja = (moo + ja);
            id = id - 1;
        }
        System.out.println(ja);
    }
}