import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
     
      Scanner in = new Scanner(System.in);
       int number = in.nextInt();
       
     int n1 = number % 10;
     int n2 = number / 10;
      while(number >= 10)
      {
        number = number / 10;
      }
     n2 = number;
     int sum = n1 + n2;
      System.out.println(sum);
	}
}