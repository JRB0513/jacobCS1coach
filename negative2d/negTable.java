// Jacob Bradley
class negTable
{
    public static void main(String args[])
    {
        int ran = 11;
        int [][] tabl = new int [ran][ran];
        for (int i = 0; i < ran; i++){
            for (int in = 0; in < ran; in++){
                tabl [i][in] = (i - 5) * (in - 5);
            }
        }
        for (int i = 0; i < ran; i++){
            for (int in = 0; in < ran; in++){
                System.out.print(tabl[i][in] + "\t");
            }
            System.out.println();
        }
    }
}