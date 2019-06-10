import java.util.Scanner;
class Main{
  public static int largest_number(int x,int y, int z)
  {
    int largest = 0;
    if(x>y && x>z)
      largest = x;
    else if(y>x && y>z)
      largest = y;
    else
      largest = z;
    return largest;
  }
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      System.out.println(largest_number(a,b,c));
	}
}