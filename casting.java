public class casting{
    public static void main(String[] args){
        //Explicit casting
        double x = 100.05;
        int y = (int)x+2;
        System.out.println(y);

        int z = 2;
        double zz =z + 1;
        System.out.println(zz);

        
        long r = 22966778;
        short rr = 6;
        
        int rrr = (int)r + (int)rr;
        System.out.println(rrr);
    }
}