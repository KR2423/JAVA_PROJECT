package Super;

public class Test {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.display();
        c.talk();
        //c.add(3, 4);
        System.out.println("Add "+c.add(10, 20));
    }
}
