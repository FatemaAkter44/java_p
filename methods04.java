public class methods04{
    public static void main(String[]args){
        dib();
        add(); 
        mul();
    
    }
    public static void dib(){
        int a=1;
        int b=2;
        System.out.println("a/b="+(a/b));
    }

    public static void add(){
        int a =10;
        double b= 10f;
        double result = (double)a +b;
        System.out.println("a+b = " + result);

    }

   
    public static void mul(){
        int a=1;
        int b=2;
        System.out.println("a*b="+(a*b));
    }

}