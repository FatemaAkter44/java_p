public class DueTax{
    public static void main(String[] args){
        double localTaxRate = 0.0888;
        double creditPercentage = 0.05;
        int gross = 1000;
        int nonTaxeble =200;
        double penAndInt = 10.00;
        int taxeble = gross -nonTaxeble;
        double preTax = taxeble * localTaxRate;
        double vendoreCredit = preTax * creditPercentage;
        double taxDue = preTax - vendoreCredit + penAndInt;

        System.out.println("tex due = " + taxDue);

       
    }
}