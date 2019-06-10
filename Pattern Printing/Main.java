import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      for (int i = row; i > 0; i--)
{
    for (int j = col; j > i; j--)
        System.out.print(j);
 
    for (int j = i; j > 0; j--)
        System.out.print(i);
 
    System.out.println();
}
    }
}