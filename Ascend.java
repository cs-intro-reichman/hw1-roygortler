// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
    public static void main(String[] args) {
        int range= Integer.parseInt(args[0]);
        int a = (int)(Math.random() * range) ;
        int b = (int)(Math.random() * range) ;
        int c = (int)(Math.random() * range) ;
        int max1=Math.max(a, b);
        int min1 =Math.min(a,b);
        int max2=Math.max(a, c);
        int min2= Math.min(a,c);
        int min3=Math.min(min1,min2);
        int min4=Math.max(min1,min2);
        int max5=Math.max(max1,max2);
        
        //int mid1=Math.min(max1,c);
        //int min2=Math.min(min1, c);
       // int mid2=Math.max(min2, c);
        
        System.out.println(min3+" "+max2+" "+max5);
        System.out.println(a+","+b+","+c);
        System.out.println(max1+","+max2+","+min1+","+min2+","+min3+","+min4+","+max5+",");
    }
   
}
