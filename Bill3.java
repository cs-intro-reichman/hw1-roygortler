// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
        String p1=args[0];
        String p2=args[1];
        String p3=args[2];
        int amount= Integer.parseInt(args[3]);
        double pay=Math.ceil((double)amount/3);
        System.out.println("Dear "+p3+", "+p2+", and "+p1+": pay "+pay+" Shekels each");
        
        
    }
}
