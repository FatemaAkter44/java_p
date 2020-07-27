public class convert{
    public static void main(String[] args){
        //convert meserment
        //measure in feet and inches into centimeters
   
        double cenPerInch = 2.54;
        int inchPerFoot =12;
       int feet= 20;
       int inches = 40;
       double totalInches = inchPerFoot * feet + inches;
       double centimeter = cenPerInch * totalInches;
   
       System.out.println("The total number of inches is : " + totalInches);
       System.out.println("The total number of centimeter : " + centimeter);
   
   
   
   
   
    }  
   }