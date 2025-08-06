package Constructor;

public class Test {
    public static void main(String[] args) {
        
    Student S = new Student();
    Student S1 = new Student("Keerthy", 24);
    Student S2 = new Student("Hema", 25);
    Student S3 = new Student("Sanjana", 24);
    Student student1 = new Student("Geethika",24 , 802866300, "MSCS");
    Student student2 = new Student("Sathwika",24,572763820,"MSCyber");
    student1.branch();
    student2.IDcard();
    S3.Attendance();
    S3.IDcard();
    }
    
}
