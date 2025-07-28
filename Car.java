public class Car {
     String carName = "Audi";
        int carNumber = 12456;
        String carColor = "white";
        int carModel = 2020;
        int carSeater = 5;

        //for car2
        String carName2 = "Benz";
        int carNumber2 = 2345;
        String carColor2 = "white";
        int carModel2 = 2023;
        int carSeater2 = 7;
        int car2Speed = 80;
        int car2Fuel = 50;
        int car2Distance = 100;
    public static void main(String[] args) {
        // String carName = "Audi";
        // int carNumber = 12456;
        // String carColor = "white";
        // int carModel = 2020;
        // int carSeater = 5;

        Car car1 = new Car();
        System.out.println("I am driving a car");
        System.out.println(car1.carName);
        System.out.println(car1.carNumber);
        System.out.println(car1.carColor);
        System.out.println(car1.carModel);
        System.out.println(car1.carSeater);

        System.out.println("carName: " + car1.carName);
        System.out.println("carNumber: " + car1.carNumber);
        System.out.println("carColor: " + car1.carColor);
        System.out.println("carModel: " + car1.carModel);
        System.out.println("carSeater: " + car1.carSeater);

        System.out.println("carName: " +car1.carName+", "+"carNumber: " + car1.carNumber+", "+"carColor: " + car1.carColor+", "+"carModel: " + car1.carModel+", "+"carSeater: " + car1.carSeater);
        
        

        // String carName2 = "Benz";
        // int carNumber2 = 2345;
        // String carColor2 = "white";
        // int carModel2 = 2023;
        // int carSeater2 = 7;
        // int car2Speed = 80;
        // int car2Fuel = 50;
        // //int car2Mileage = 30;
        // int car2Distance = 1542;


        Car car2 = new Car();
        System.out.println("I have an another car");

        System.out.println(car2.carName2);
        System.out.println(car2.carNumber2);
        System.out.println(car2.carColor2);
        System.out.println(car2.carModel2);
        System.out.println(car2.carSeater2);

        System.out.println("carName: " + car2.carName2);
        System.out.println("carNumber: " + car2.carNumber2);
        System.out.println("carColor: " + car2.carColor2);
        System.out.println("carModel: " + car2.carModel2);
        System.out.println("carSeater: " + car2.carSeater2);

        System.out.println("carName: " +car2.carName2+", "+"carNumber: " + car2.carNumber2+", "+"carColor: " + car2.carColor2+", "+"carModel: " + car2.carModel2+", "+"carSeater: " + car2.carSeater2);

        Math m1 = new Math(); // I have created a new object of Math class
        m1.sum(car2.carNumber2, car2.carSeater2); // I have called the sum method from Math class
        m1.sum(car2.carModel2, car1.carModel);

        System.out.println("Now I will tell the car2 mileage:");
        m1.Mileage(car2.car2Distance, car2.car2Fuel);


        System.out.println("Tell me the time travelled by car2");
        m1.TimeTravelledbycar2(car2.car2Distance, car2.car2Speed); // For time I want to the o/p in hrs but it should show in decimal how can I do that?

        // m1.totalCalculationsforCar2(car2.car2Distance, car2.car2Mileage, TimeTravelledbycar2);







    }
    
}
