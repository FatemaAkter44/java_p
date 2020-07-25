//calculet tex due
public class p19{
    public static void main(String[] args){
        double localTexRet = 0.0123;
        double creditPercentage = 0.01;
        int gross = 200000;
        int nonTaxable= 50000;
        double penaltiesAndInterest = 1000;

        double perTex = gross * creditPercentage;
       
         System.out.println("the tex: " + perTex);


    }
}