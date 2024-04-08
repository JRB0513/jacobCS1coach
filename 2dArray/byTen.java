// Jacob Bradley
class byTen
{
    public static void main(String args[])
    {
        int si = 8;
        int [][] tab = new int [si][si];
        for (int i = 0; i < si; i++){
            for (int in = 0; in < si; in++){
                tab[i][in] = (i + 1) * (in + 1 );
            }
        }
        for (int i = 0; i < si; i++){
            for (int in = 0; in < si; in++){
                System.out.print(tab[i][in] + "\t");
            }
            System.out.println();
        }
    }
}