package Encapsulation;

public class TestE {
 public static void main(String[] args) {
    CarE c1 = new CarE();
    c1.setCarEname("Swift");
    c1.setCarEmodel("xyz"); // how can we give the input ?
    c1.driving();
    System.out.println("CareName: " + c1.getCarEname());
    System.out.println("CarModel : " + c1.getCarEmodel());

    CarE c2 = new CarE();
    c2.setCarEname("Dezire");
    c2.setCarEmodel("abc");
    c2.driving();
    System.out.println("I have an another Car");
    System.out.println("carName: " + c2.getCarEname()+"," + "carModel: " + c2.getCarEmodel());

    CarE c3 = new CarE();
    c3.setCarEname("BMW");
    c3.setCarEnumber1(2324);
    c3.setCarEmodel("key");
    c3.setCarEcolor("Black");
    c3.driving();
    System.out.println("This is my Office Car");
    System.out.println("carName: "+c3.getCarEname()+","+"carNumber: "+c3.getCarEnumber1()+","+"carModel: "+c3.getCarEmodel()+","+"carColor: "+c3.getCarEcolor());




 }

}
