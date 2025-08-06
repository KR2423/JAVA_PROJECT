package Abstraction;

public class Ford extends Car {
    double Fspeed;
    double distance;
    int time;
    double Fdistance;
    
    @Override
    double speed(double a,double b) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'speed'");
         Fspeed = a/b;
        return Fspeed;
    }
    @Override
    double distance(int a,int b) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'distance'");
        Fdistance = a*b;
        return Fdistance;
    }
    @Override
    void driving() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'driving'");
        System.out.println("I am driving Ford car");
    }
    
}
