// Jacob Bradley
import java.util.Scanner;
class fiboFunction
{
    public static void findFibo(){
        Scanner giv = new Scanner(System.in);
        System.out.println("Enter a number for the length of the fibonacci sequence: ");
        int num = giv.nextInt();
        int thi = 0;
        int tha = 1;
        int sol = 0;
        // https://www.javatpoint.com/fibonacci-series-in-java
        for (int i = num - 1; i >= 1; i--){
            sol = (tha + thi);
            thi = tha;
            tha = sol;
        }
        if (sol == 0){
            sol = 1;
        }
        System.out.println(sol);
    }
    public static void main(String args[])
    {
        findFibo();
    }
}