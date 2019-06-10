import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int rowno = 1;rowno <= n; rowno++)
	    {
            // Handle numbers for each row
	        for(int colno = 1; colno <= n; colno++)
	        {
                // Condition to print numbers
	            if(((rowno % 2 == 0) && (colno == 1)) 
	                || ((rowno % 2 == 1) && (colno == n)))
	            {
	                System.out.print(rowno + 1);
	            }
	            else{
	                System.out.print(rowno);
	            }
	        }
	        System.out.println();
	    }
	}
}