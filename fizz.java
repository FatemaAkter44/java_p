public class fizzBuzz{
    public static void main(String[] args){
     int user_input = 7;
     if(user_input % 5 == 0 && user_input % 3 == 0)
     System.out.println("FizzBuzz");
     else if (user_input % 5 == 0)
     System.out.println("Fizz");
     else if (user_input % 3 == 0)
     System.out.println("Buzz");
     else
     System.out.println(user_input);
    }
}