import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int rowno = 1; rowno <= n; rowno++)
	    { 
            // Handle stars for each row
	        for(int colno = 1; colno <= n; colno++)
	        {
                // Condition to print stars 
	            if((rowno == 1) || (colno == 1) || 
                   (rowno == n) || (colno == n))
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}