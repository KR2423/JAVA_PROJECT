package Polymorphism.MethodOverriding;

public class Bank {
    int SI;
    int T;
    int P;
    double RateOfInterest;
    public double RI(int a,int b,int c){
        RateOfInterest = (a*100)/b*c;
        return RateOfInterest;

    }
    
    
}
