package Constructor;

public class Student {
    String name;
    int age;
    int phonenumber;
    String college;
    String classname;

    Student(){
        System.out.println("My name is Constructor.I am from Student class");
    }
    Student(String name1, int age){
        //this.name = name;
        name = name1;
        this.age = age;
        System.out.println("Student details = "+"Name: "+name+", "+"Age: "+age);

    }
    Student(String name, int age, int phonenumber, String classname){
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.classname = classname;
        System.out.println("Student details = "+"Name:"+name+", "+"Age:"+age+", "+"PhoneNum:"+phonenumber+", "+"ClassName:"+classname);
    }
    void branch(){
        System.out.println("Name "+name);
        System.out.println("ClassName "+classname);
    }
    void IDcard(){
        System.out.println("Name: "+name);
        System.out.println("PhoneNumber: "+phonenumber);
        System.out.println("ClassName: "+classname);
    }
    void Attendance(){
        System.out.println("Name: "+name);
        System.out.println("ClassName: "+classname);


    }


}
