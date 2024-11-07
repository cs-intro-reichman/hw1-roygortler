// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int amount= Integer.parseInt(args[0]);
		double percentage = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double yield= amount* (double)Math.pow(1+(percentage/100),years);
		int yield1= (int)yield;
		System.out.println( yield1);
		System.out.println("After "+years+" years, a $"+amount+" saved at "+percentage+" will yield $"+ yield1);
		
}
}