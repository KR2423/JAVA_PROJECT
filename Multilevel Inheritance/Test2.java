package Inheritance;

public class Test2 {
    public static void main(String[] args) {
        Orange o1 = new Orange();
        o1.Myname = "fruits";
        o1.Mynumber = 4;
        o1.F1();
        o1.F2();
        System.out.println("Myname: "+o1.Myname+" , "+"My Number: "+o1.Mynumber);

        o1.F1Name = "Apple";
        o1.F1color = "Red";
        o1.A1();
        o1.A2color();
        System.out.println("My Name: "+o1.F1Name+" , "+"My Color: "+o1.F1color);

        o1.F2name = "Banana";
        o1.F2color = "Light Yellow";
        o1.B1name();
        o1.B1color();
        System.out.println("My Name: "+o1.F2name+" , " + "My Color: "+o1.F2color);

        o1.F3name ="Mango";
        o1.F3color ="Mustard Yellow";
        o1.M1name();
        o1.M1color();
        System.out.println("My Name: "+o1.F3name+" , " +"My Color: "+o1.F3color);

        o1.F4name ="Orange";
        o1.F4color ="Light Orange";
        o1.O1Name();
        o1.O2color();
        System.out.println("My Name: "+o1.F4name+" , "+"My Color: "+o1.F4color);
    }
    
}
