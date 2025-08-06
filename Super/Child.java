package Super;

public class Child extends Parent {
    int sum1;
    public void display(){
        super.display();
        System.out.println("I am from 1st Child class");
    }
    public void talk(){
        super.talk();
        System.out.println("I am talking about 1st Child class");
    }
    public int add(int a, int b){
       int res= super.add(a, b);
         //sum1 = a+b+a;
         return res;
    }
    
}
