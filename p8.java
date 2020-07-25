public class p8{
    public static void main(String[] args){
        //Explicit casting
        double x = 1.1;
        int y = (int)x+2;
        System.out.println(y);

        int z = 2;
        double zz =z + 1;
        System.out.println(zz);

        //float r = 3333333.33333; error: incompatible types: possible lossy conversion from double to float
        float r = 333.333 f;
        float rr = 666.666 f;
        //double r = 333.333;
        //double rr = 666.666;
        //int rrr = r + rr; //incompatible types: possible lossy conversion from float to int
        int rrr = (int)r + (int)rr;
        System.out.println(rrr);
    }
}