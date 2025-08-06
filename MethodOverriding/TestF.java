package Polymorphism.MethodOverriding;

public class TestF {
    public static void main(String[] args) {
        Fruit F1 = new Fruit();
        F1.Apple();
        F1.juice();
        //System.out.println(F1.Apple());
        Fruit O1 = new Orange();
        O1.Apple();
        O1.juice();
        //System.out.println("Orange child"+ O1.Apple());
        Fruit B1 = new Banana();
        B1.Apple();
        B1.juice();
        
    }
    
}
