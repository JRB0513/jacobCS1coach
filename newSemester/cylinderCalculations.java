// Jacob Bradley
class cylinderCalculator
{
    public static void main(String args[])
    {
        double cyrad = 5;
        double cyheigh = 8;
        double cyradsquare = 25;
        double cyvol = (Math.PI * cyradsquare * cyheigh);
        double cysurareapar1 = (2 * Math.PI * cyrad * cyheigh);
        double cysurareapar2 = (2 * Math.PI * cyradsquare);
        double cysurareafin = (cysurareapar1 + cysurareapar2);
        {
            System.out.println("The volume of a cylinder with a height of 8 and a radius of 5 is" + cyvol );
            System.out.println("The surface area would be " + cysurareafin );
        }
    }
}