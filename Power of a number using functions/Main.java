import java.util.Scanner;
class Main {
  public static int power_of_number(int base, int exponent)
  {
    int result =1;
    while(exponent!=0)
    {
      result = result*base;
      --exponent;
    }
    return result;
  }
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
      int base =in.nextInt();
      int exponent = in.nextInt();
      int result = power_of_number(base,exponent);
      System.out.println(result);
    }
  }