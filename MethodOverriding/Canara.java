package Polymorphism.MethodOverriding;

public class Canara extends Bank{
    int RIofC;
    int SI;
    int P;
    int T;

    public double RI(){
        RIofC = (SI*100)/P*T;
        return RIofC;
    }
    
}
