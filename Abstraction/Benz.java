package Abstraction;

public class Benz extends Car {
    double distance;
    double time;
    double speed;
    //double Bdistance;
    @Override
    void driving() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'driving'");
        System.out.println("I am driving a Benz Car");
    }
    @Override
    double speed(double a, double b) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'speed'");
        speed = a/b;
        return speed;
    }
    @Override
    double distance(int a, int b) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'distance'");
        distance = a*b;
        return distance;
    }
    
}
