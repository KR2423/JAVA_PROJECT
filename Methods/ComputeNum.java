package Methods;

// 2. Compute Average of Three Numbers

// Write a Java method to compute the average of three numbers.
// Test Data:
// Input the first number: 25
// Input the second number: 45
// Input the third number: 65
// Expected Output:

// The average value is 45.0
import java.util.*;
public class ComputeNum {
    int Average;
    int countofNumbers = 3;
    public double Average(int a, int b,int c){
            Average = (a+b+c)/countofNumbers;
            return Average;
        }
    public static void main(String[] args) {
        Scanner C1= new Scanner(System.in);
        System.out.println("Input the 1st Number");
        int a = C1.nextInt();
        System.out.println("Input the 2nd Number ");
        int b = C1.nextInt();
        System.out.println("Input the 3rd Number");
        int c = C1.nextInt();

        ComputeNum CN1 = new ComputeNum();
        //CN1.countofNumbers(3);
        CN1.Average(a,b,c);
        System.out.println("The average value is "+CN1.Average);
    }

    //    public static double Average(int a, int b,int c){
    //         Average = (a+b+c)/countofNumbers;
    //     }

    }
    

