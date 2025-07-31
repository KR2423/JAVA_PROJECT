package Inheritance.StudentMarks;

public class Sem4 extends Sem3{
    int S4sub1;
    int S4sub2;
    int S4sub3;
    int S4sub4;
    int S4totalmarks;
    int S4totalMaximumMarks;
    float S4percentage;
    public void S4totalmarks(){
        S4totalmarks = S4sub1+S4sub2+S4sub3+S4sub4;
        System.out.println("Sem 4 Total Marks = "+S4totalmarks);
    }
    public void S4totalMaximumMarks(){
        S4totalMaximumMarks=4*100;
    }
    public void S4percentage(){
        S4percentage = (S4totalmarks*100)/S4totalMaximumMarks;
        System.out.println("Sem 4 Percentage is "+ S4percentage);
    }
    
}
