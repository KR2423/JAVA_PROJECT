package Abstraction;

public class Audi extends Car{
    double Aspeed;
    double distance;
    int time;
    double Adistance;
    
    @Override
    double speed(double a,double b) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'speed'");
       Aspeed = a/b;
        return Aspeed;
    }
    @Override
    double distance(int a,int b) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'distance'");
        Adistance = a*b;
        return Adistance;
    }
    @Override
    void driving() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'driving'");
        System.out.println("I am driving an Audi car");
    }
    
}
