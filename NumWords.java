// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int x = Integer.parseInt(args[0]);
        System.out.println(x/100+" hundreds, "+x%100/10+" tens, and "+x%10+" ones.");
		
            
	}
}
