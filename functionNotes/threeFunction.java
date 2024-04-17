// Jacob Bradley
import java.util.Scanner;
class threeFunction
{
    public static int givNum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static void main(String args[])
    {
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int one = numb.nextInt();
        System.out.println("Enter second number: ");
        int two = numb.nextInt();
        System.out.println("Enter third number: ");
        int three = numb.nextInt();
        int fin = givNum(one, two, three);
        System.out.println(one + " plus " + two + " plus " + three + " equals " + fin);
    }
}