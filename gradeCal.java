public class gradeCal{
    public static void main(String[] args){
        int marks =65;
        if(marks>=80){
            System.out.println("A+");
        }
        else if (marks>=70){
            System.out.println("A");

        }
        else if(marks>=60){
            System.out.println("B");

        }
        else if(marks> 50){
            System.out.println("c");
        }
        else System.out.println("failed");
        
    }
}