import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int l = number % 10;
      int f = number / 10;
      int sum = l + f;
      System.out.println(sum);
	}
}