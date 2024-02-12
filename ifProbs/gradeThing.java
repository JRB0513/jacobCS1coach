// Jacob Bradley
import java.util.Scanner;
class gradeThing
{
    public static void main(String args[])
    {
        Scanner grade = new Scanner(System.in);
        System.out.println("What grade did you get on an assignment?");
        int givgrad = grade.nextInt();
        if (givgrad < 60){
            System.out.println("You got an F, try harder next time.");
        }
        else if (givgrad < 70){
            System.out.println("You got a D, you barely passed.");
        }
        else if (givgrad < 80){
            System.out.println("You got a C, not bad.");
        }
        else if (givgrad < 90){
            System.out.println("You got a B, pretty good.");
        }
        else if (givgrad < 101){
            System.out.println("You got an A, fantastic job.");
        }
        else{
            System.out.println("I don't think there's a letter for that grade.");
        }
    }
}