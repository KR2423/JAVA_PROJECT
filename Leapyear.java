import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the year ");
        int n = s1.nextInt();

        if(n%4 == 0){
            if(n%100 == 0){
                if(n%400 == 0){
                    System.out.println(n + " is a Leap year");
                }else{
                    System.out.println(n + " is not a Leap year");
                }
            }else{
                System.out.println(n+" is not a Leap Year");
            }
        }else{
            System.out.println(n+ " is not a Leap year because " + n + " is not divisible by 4");
        }
            
        
        
    }
    
}
