public class methods{
    public static void main(String[]args){
     add();
     //sub(); //error: non-static method sub() cannot be referenced from a static context
    }
    public static void add(){
        int a =10;
        float b= 10.10f;
        double result =(double) a + (double) b;
        System.out.println("a+b = " + result);

    }

    public void sub(){
        int a=1;
        int b=2;
        System.out.println("b-a="+(b-a));
    }
}