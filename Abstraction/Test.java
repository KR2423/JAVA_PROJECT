package Abstraction;

public class Test {
    public static void main(String[] args) {
        Car B = new Benz();
        B.driving();
        System.out.println("Speed of Benz car "+B.speed(80,20));
        System.out.println("Distance of Benz car "+B.distance(300, 4));
        Car A = new Audi();
        A.driving();
        System.out.println("Speed of Audi car "+B.speed(65,40));
        System.out.println("Distance of Audi car "+B.distance(720, 8)); //if I want time in double how can I do that?
        Car F = new Ford();
        F.driving();
        System.out.println("Speed of Ford "+F.speed(79, 6));
        System.out.println("Distance of Ford car "+F.distance(623, 7));


         
        
    }
    
}
