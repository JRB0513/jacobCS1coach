// Jacob Bradley
import java.util.Scanner;
class factorialFunction
{
    public static void findFact(){
        Scanner given = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = given.nextInt();
        for (int i = num - 1; i >= 1; i--){
            num = (num * i);
        }
        System.out.println(num);
    }
    public static void main(String args[])
    {
        findFact();
    }
}