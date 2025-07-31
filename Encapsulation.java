public class Encapsulation {
   private String empName;
   private int empID;
   private String companyName;

    public String getempName(){
        return empName;
    }
    public void setempName(String empName){
        this.empName = empName;
    }
    public int getempID(){
        return empID;
    }
    public void setempID(int empID){
        this.empID = empID;
    }
    public String getcompanyName(){
        return companyName;
    }
    public void setcompanyName(String companyName){
       this.companyName = companyName;
    }
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.empName = "Keerthi";
        e1.empID = 2345;
        e1.companyName = "Walmart";
        System.out.println(e1.empName + " works in " + e1.companyName + " and " + e1.empName+"'s Employee ID is "+e1.empID );
        
    }
    
}
