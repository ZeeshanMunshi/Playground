import java.util.Scanner;
 class Main{
   public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
      System.out.println(gcd_of_3_numbers(a,b,c));
	}
  public static int gcd_of_3_numbers(int x,int y,int z)
  {
    int min , gcd;
    if(x<y && x<z)
      min = x;
    else if(y<x && y<z)
      min = y;
    else 
      min = z;
    while(min >= 1)
    {
      if((x%min==0) && (y%min==0) && (z%min==0))
      {
        gcd = min;
        break;
      }
      min--;
    }
    return min;
    }
	}