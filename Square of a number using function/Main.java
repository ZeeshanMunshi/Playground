import java.util.Scanner;
class Main
{
  public static int square_of_number(int m)
  {
    int square = m*m;
    return square;
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int square = square_of_number(n);
      System.out.println(square);
	} 
}