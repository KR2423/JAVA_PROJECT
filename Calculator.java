
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner calci = new Scanner(System.in);
        System.out.println("Enter your number1");
        int num1 = calci.nextInt();
        System.out.println("Enter your number2");
        int num2 = calci.nextInt();
        //System.out.println("your result" );
        int sum = num1 + num2;
        System.out.println("your result:" + sum);

        int sub = num1 - num2;
        System.out.println("your result:" + sub);

        int multiply = num1 * num2;
        System.out.println("your result:" + multiply);

        int division = num1/num2;
        System.out.println("your result:" + division);



        calci.close();

        
    }
    
}
