// Jacob Bradley
import java.util.Scanner;
class primeFunction
{
    public static void findPrime(){
        Scanner giv = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = giv.nextInt();
        boolean thing = false;
        for (int i = 2; i <= num / 2; i++){
            // https://www.programiz.com/java-programming/examples/prime-number
            if (num % i == 0){
               thing = true;
            }
        }
        if (thing != true){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
    public static void main(String args[])
    {
        findPrime();
    }
}