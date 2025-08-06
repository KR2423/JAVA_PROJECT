package Methods;
// 1. Find Smallest Number Among Three

// Write a Java method to find the smallest number among three numbers.
// Test Data:
// Input the first number: 25
// Input the Second number: 37
// Input the third number: 29
// Expected Output:

// The smallest value is 25.0
//import java.util.*;
public class SmallNum {
    public double SmallestNumber(int a, int b, int c){
        return (Math.min(Math.min(a, b),c));
        
    }
    

public static void main(String args[]){
    // Scanner S1 = new Scanner(System.in);
    // System.out.println("Input the fisrt Number");
    // int a = S1.nextInt();
    // System.out.println("Input the Seconde Number");
    // int b = S1.nextInt();
    // System.out.println("Input the Third Number");
    // int c = S1.nextInt();
    SmallNum Snum = new SmallNum();
    //Snum.SmallestNumber(10,20,30);
    System.out.println("The Smallest num is "+Snum.SmallestNumber(10,20,30));



}
}