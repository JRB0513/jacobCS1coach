// Jacob Bradley
class chessBoard
{
    public static void main(String args[])
    {
        int ze = 8;
        char [][] arr = new char [ze][ze];
        int [][] ta = new int [ze][ze];
        char bla = '+';
        char whi ='*';
        for (int i = 0; i < ze; i++){
            for (int in = 0; in < ze; in++){
            if ((in + i) % 2 == 0)
            {
                arr[i][in] = '*';
            }
            else{
                arr[i][in] = '+';
            }
            }
        }
        for (int i = 0; i < ze; i++){
            for (int in = 0; in < ze; in++){
                System.out.print(arr[i][in]);
            }
            System.out.println();    
        }
    }
}
