package Polymorphism.MethodOverriding;

public class SBI extends Bank{
    int SI;
    int P;
    int T;
    double RIofSBI;

    public double RI(int a,int b,int c){
        RIofSBI = (a * 100)/(b * c);
        return RIofSBI;

    }
    
}
