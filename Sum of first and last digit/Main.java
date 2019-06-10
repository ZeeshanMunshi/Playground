import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int first_digit;
      int last_digit;
      int sum = 0;
      first_digit = number;
      while(first_digit >= 10)
      {
        first_digit = first_digit / 10;
      }
      last_digit = number%10;
      sum = first_digit + last_digit;
      System.out.println(sum);
	}
}