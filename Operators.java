public class Operators {
    public static void main(String args[]) {
        // arthimetic operations - Basic math operations

        byte B1 = 40;
        byte B2 = 20;
        System.out.println("B1 + B2= " + (B1+B2));
        System.out.println("B1 - B2= " + (B1-B2));
        System.out.println("B1 * B2= " + (B1*B2));
        System.out.println("B1 / B2= " + (B1/B2));
        System.out.println("B1 % B2= " + (B1%B2));  // gives you the remainder

        //Relational Operators - Compare values and gives --> (true/false)
        short a = 5;
        short b = 10;
        System.out.println("a == b= " + (a==b));
        System.out.println("a != b= " + (a!=b));
        System.out.println("a > b= " + (a>b));
        System.out.println("a < b= " + (a<b));
        int x = 4;
        int y = 4;
        System.out.println("x >= y= " + (x>=y));
        System.out.println("x <= y= " + (x<=y));

        //Logical Operators -- AND (&&), OR(||), NOT (!)

        // AND - true only if both of its operands are true
        // OR -  returns true if at least one of its operands is true
        boolean b1 = (a>b);
        boolean b2 = (x>y);
        System.out.println("Answer for AND operator= " + (b1&&b2));
        System.out.println("Answer for OR operator= " + (b1||b2));
        System.out.println("Answer for NOT operator= " + !(b1==b2));

        //Assignment Operators -- it assigns value which is on the right side to the left side
        
         a += 3;
         System.out.println("After a + 3=" + a);

         b -= 5;
         System.out.println("After b - 3=" + b);

         a*=2;
         System.out.println("After a * 2=" + a);

         // Unary Operations - operate on a single operand

         //Pre	++a: Increments first, then uses the value
         //Post	a++: Uses the value, then increments
          
         int d = 9;
         System.out.println(" Unary Operators :");
         System.out.println("d= " + (++d));
         int e = 12;
         System.out.println("e= " + (e++));
         int f = 15;
         System.out.println("f= " + (--f));
         int g = 18;
         System.out.println("g= " + (f--));

         // Ternary Operator = shorthand for an if-else statement

         // (condition) ? value_if_true : value_if_false; 
         // if the condition is true it prints the value after " ? " else prints the value after " : "

         int age = 22;
         String marriage = (age >= 21) ? "can marry" : "no marry";
         System.out.println("marriage = " +marriage);
         if(age>=21){
            System.out.println("can marry");
         }else{
            System.out.println("no marry");
         
         }












    }
    
}
