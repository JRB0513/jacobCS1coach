// Jacob Bradley
import java.util.Scanner;
class distanceCalculator
{
    public static void main(String args[]) 
    {
        double[] point1 = getCoordinates("Enter Coordinates for point 1 (x1, x2): ");
        double[] point2 = getCoordinates("Enter Coordinates for point 2 (y1, y2): ");
        double dist = calculateDistance(point1[0], point1[1], point2[0], point2[1]);
        System.out.println("The distance between the points is: %.2f\n " + dist);
    }
    private static double[] getCoordinates(String go){
        Scanner thing = new Scanner(System.in);
        System.out.println(go);
        double x = thing.nextDouble();
        double y = thing.nextDouble();
        return new double[]{x, y};
    }
    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}