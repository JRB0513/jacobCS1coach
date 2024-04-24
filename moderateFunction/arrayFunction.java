// Jacob Bradley
import java.util.Scanner;
class arrayFunction
{
    public static void largeArray(){
        Scanner num = new Scanner(System.in);
        int [] gro = new int [5];
        int great = 0;
        for(int i = 0; i <= gro.length - 1; i++){
            System.out.println("Enter a number: ");
            gro[i] = num.nextInt();
        }
        for (int in = 0; in <= gro.length - 1; in++){
            if (gro[in] > great){
                great = gro[in];
            }
        }
        System.out.println("The greatest number is " + great);
    }
    public static void main(String args[])
    {
        largeArray();
    }
}