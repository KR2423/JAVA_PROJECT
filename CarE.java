package Encapsulation;

public class CarE {
    private String CarEname;
    private String CarEmodel;
    private int CarEnumber1;
    private String CarEcolor;
     
    public String getCarEname() {
        return CarEname;
    }
    public void setCarEname(String carEname) {
        this.CarEname = carEname;
    }
    public String getCarEmodel() {
        return CarEmodel;
    }
    public void setCarEmodel(String carEmodel) {
        this.CarEmodel = carEmodel;
    }
    public int getCarEnumber1(){
        return CarEnumber1;
    }
    public void setCarEnumber1(int CarEnumber1){
        this.CarEnumber1 = CarEnumber1;
    }

    public String getCarEcolor(){
        return CarEcolor;
    }
    public void setCarEcolor(String CarEcolor){
        this.CarEcolor = CarEcolor;
    }
    
    public void driving(){
        System.out.println("I am driving the car");
    }
    
}
