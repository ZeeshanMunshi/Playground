import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int reverse = 0;
    while(number!= 0)
    {
      reverse = reverse * 10;
      reverse = reverse + number % 10;
      number = number / 10;
  }
    System.out.println(reverse);
}
}