public class modulasPrac{
    public static void main(String[] args){
        //implicite casting
        
        short x =1;
        int y = x+2;
        System.out.println("\"y\" value is: " + y );
        double z = x%y;
        System.out.println ("double z is = " + z);

        int zz = x%y;
        System.out.println("integer value of zz =" +zz);

        double zzz = y%x;
        System.out.println(" the value of zzz= " + zzz);

        int zzzz = y%x;
        System.out.println("the int value if zzzz = " + zzzz);
    }
}