public class methods01{
    public static void main(String[]args){
     add();
     sub(); 
    }
    public static void add(){
        int a =10;
        float b= 10.10f;
        double result =(double) a + (double) b;
        System.out.println("a+b = " + result);

    }

    public static void sub(){
        int a=1;
        int b=2;
        System.out.println("b-a="+(b-a));
    }
}