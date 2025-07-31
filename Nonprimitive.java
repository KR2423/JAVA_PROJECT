
import java.util.*;
public class Nonprimitive {

    

    //Non-Primitive DataTypes - They are also known as reference objects
    // We don't store the values into variables as we did in primitive but we 
    //store them as reference ( memory address) to objects.
    public static void main(String[] args) {
    // String --> String is a non-primitive (class-based) type that stores sequences of characters.
    //char --> holds a single character
    // String --> holds multiple character.
        String s = "Keerthi";
        System.out.println("Its a string: " + s);


    // Array - used to store multiple values of the same datatype in a single, continuous blocks of memory.
    // Syntax: dataType[] arrayName = new dataType[size];
    //int[] number = {2, 4, 6, 8}
    
    // Class --> Its the blueprint of the object
    //Syntax: class classname{
    // dataType variablename

    //returntype methodname

    // }

    class book{
        //String bookname;
        int booknum;
    //class book{
        //String bookname;
        //int booknum;

        
        // Scanner book = new Scanner(System.in);
        // System.out.println("Enter Book name:" );
        // String bookname = book.next();

        // book.diplay();

    }
    
     Scanner book = new Scanner(System.in);
     System.out.println("Enter Book name:" );
     String bookname = book.next();



        //book.diplay();


    }
    
}
