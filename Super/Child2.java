package Super;

public class Child2 extends Child {
    int sum2;
    public void display(){
        super.display();
        System.out.println("I am from 2nd Child class");
    }
    public void talk(){
        super.talk();
        System.out.println("I am from talking about 2nd Child class");
    }
    public int add(int a, int b){
        int res =super.add(a, b);
        //int res = res+a; // what if i want to perform seperate calculation here?
         return res;
         
    }
    
}
