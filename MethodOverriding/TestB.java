package Polymorphism.MethodOverriding;

public class TestB {
    public static void main(String[] args) {
        Bank B1 = new Bank();
        B1.SI=1200;
        B1.P=12000;
        B1.T=2;
        System.out.println("Rate of Interest = "+B1.RI(B1.SI,B1.P,B1.T));
        Bank S1 = new SBI();
        S1.SI=1500;
        S1.P = 10000;
        S1.T=3;
        System.out.println("Rate Of Interest of SBI = "+S1.RI(S1.SI,S1.P,S1.T));

        Bank H1 = new Hdfc();
        H1.SI = 60000;
        H1.P = 40000;
        H1.T=5;
        System.out.println("rate of Interest of HDFC = "+H1.RI(H1.SI,H1.P,H1.T));
    }
    
}
