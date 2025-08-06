package Super;

public class Parent {
    int sum;
    public void display(){
        System.out.println("I am from a Parent class");
    }
    public void talk(){
        System.out.println("I am talking about Parent class");
    }
    public int add(int a,int b){
        sum=a+b+b;
        return sum;
        
    }
    
}
