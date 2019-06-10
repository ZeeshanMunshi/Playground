import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int rowno = 1; rowno <= n; ++rowno)
	    {
             // Handle stars for each row
	         for(int colno = 1; colno <= n; ++colno)
	         {
                
	                // When row no and col no are equal, print "*"
                    // Otherwise print space
	                if((rowno == colno) ||
	                  (rowno + colno == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}