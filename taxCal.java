public class taxCal{
    public static void main(String[] args){
        int income = 50000; 
        float taxrate= 0.15f;

        int taxtopay = income * (int)taxrate;
        System.out.println("taxtopay"+ taxtopay);
        mul();
    }

    public static void mul(){
        int a, b, result;
        a = 2;
        b = 4;
        result = a*b;
        System.out.println(result);
    }
}