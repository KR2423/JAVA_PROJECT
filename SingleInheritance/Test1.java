package Inheritance;

public class Test1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Parentname = "Ravinder";
        c.Parentage = 42;
        c.Parentoccupation = "Farmer";
        c.P1();
        c.P2();
        System.out.println("Parent Name: "+c.Parentname+", "+ "Parent Age: "+ c.Parentage+", "+"Parent Occupation: "+c.Parentoccupation );

        c.childName = "Keerthi";
        c.childAge = 24;
        c.childClass = "9th Class";
        c.C1();
        c.C2();
        System.out.println("Child Name: "+c.childName+", "+"Child Age: "+c.childAge+","+"Child Class: "+c.childClass);

    }
    
}
