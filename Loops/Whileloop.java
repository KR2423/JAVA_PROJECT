
    
import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class Whileloop {
    public static void main(String[] args) {

        // To take input 
        // 1. Create a Scanner Object - which reads input from System.in
        Scanner calci = new Scanner(System.in);
        int i=1;
        while(true){
            
        System.out.println("Press 1 to continue or 0 to exit");
         int n = calci.nextInt();
        if(n == 1){
            
        System.out.println("Enter your number 1");
        int a = calci.nextInt();

        System.out.println("Enter your number 2");
        int b = calci.nextInt();

        System.out.println("What operation you want to perform ?");
        String op = calci.next();

        switch (op) {
            case "+":
            System.out.println("You entered 1st block a+b = " + (a+b));
                break;
            case "-":
            System.out.println("You entered 2nd Block a-b = " + (a-b));
            break;
            case "*":
            System.out.println("You entered 3rd block a*b = " + (a*b));
            break;
            case "/":
            System.out.println("You entered 4th block a/b = " + (a/b));
            break;
            case "%":
            System.out.println("You entered 5th block a%b = " + (a/b));
            break;
            case "++":
            System.out.println("You entered 6th block " + ("a++ is "+(a++))+"and "+ ("++a is "+(++a)));
            //System.out.println("You entered 6th block ++a is " + (++a));
            break;
            case "--":
            //System.out.println("You entered 7th block " + (b--)+", "+ (--b));
            // I want to print both --b and b-- how can I do that?
            System.out.println("You entered 7th block --b is " + (--b) );
            break;

            default:
            System.out.println("You entered an invalid operator ");
                break;

        }
        i++;
       }
       else if(n == 0){
        System.out.println("Exiting the Calculator");
        break;
       }
       else{
        System.out.println("Entered invalid number");
        break;
       }
    }
       System.out.println("Enter the equation");
       String equation = calci.nextLine();
       
    }
    

        


        
    }
    


