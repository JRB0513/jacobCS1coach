// Jacob Bradley
import java.util.Scanner;
class findIt
{
    private static boolean check(int[] arr, int toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        // found on https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
 
        // Print the result
        System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);
        return test;
    }
    public static void main(String args[])
    {
        Scanner giv = new Scanner(System.in);
        int [] ar = new int [25];
        int [] seen = new int [25];
        int [] dupli = new int [25];
        boolean isdupli = false;
        int next = 0;
        System.out.println("Enter up to 25 numbers");
        for (int i = 0; i < ar.length; i++){
            System.out.println("Enter number " + (i + 1) + " : ");
            ar[i] = giv.nextInt();
        }
        System.out.println("You entered these numbers: ");
        for (int thing : ar){
            System.out.println(thing);
        }
         for (int in = 0; in <= ar.length - 1; in++){
            isdupli = check(seen, ar[in]);
            if (isdupli == true){
            System.out.println("The duplicate value is " + ar[in]);
            }
            else {
            seen[in] = ar[in];
            }
        }
    }
}