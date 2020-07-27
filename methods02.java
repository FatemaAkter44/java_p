public class methods02{
    public static void main(String[]args){
        add(); 
        mul();
    
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