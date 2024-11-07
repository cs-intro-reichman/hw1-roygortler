public class Ascend {
    public static void main(String[] args) {
        int range= Integer.parseInt(args[0]);
        int a = (int)(Math.random() * range) ;
        int b = (int)(Math.random() * range) ;
        int c = (int)(Math.random() * range) ;
        int min1=Math.min(a, b);
        int max2 =Math.max(a,b);
        int max3=Math.max(min1, Math.min(max2,c));
        int max4= Math.max(max2,c);
       
        
        
        int min2=Math.min(min1, c);
       
        
        System.out.println(min2+" "+max3+" "+max4);
        System.out.println(a+","+b+","+c);
        
    }
   
}
