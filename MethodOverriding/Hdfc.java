package Polymorphism.MethodOverriding;

public class Hdfc extends Bank {
    double RIofH;
    int SI;
    int P;
    int T;
    public double RI(int a,int b,int c){
        RIofH = (a*100)/(b*c);
        return RIofH;
    }
    
}
