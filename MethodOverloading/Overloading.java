package Polymorphism;

//Overloading - same method with different parameters
//When writing a method, ask:

//Will the result be used outside the method? → Use int (or another type).

//Will the method just do something, like print or update a value? → Use void.
public class Overloading {
    public int add(int a,int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public float add(int x, float y, float z){
        return x+y+z;
    }
    public double sub(double x, float c){
        return x-c;
    }
    public double multiply(int a, int b, int c){
        return a*b*c;
    }
    public double multiply(int a, double x, float c){
        return a*x*c;
    }
    public double sub(int a, int x){
        return a-x;
    }
    public int add(short f, short g){
        return f+g;
    }
    public int add(short f, byte h){
        return f+h;
    }
    public int divide(int i, int j){
        return i/j;
    }
    public static void main(String args[]){
        Overloading O1 = new Overloading();
        System.out.println(O1.add(2,4));
        System.out.println(O1.add(4, 6,80));
        System.out.println(O1.divide(20, 5));

    }
    
}


    
