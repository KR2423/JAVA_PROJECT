package Inheritance.StudentMarks;

public class Sem2 extends Sem1 {
    int S2sub1;
    int S2sub2;
    int S2sub3;
    int S2totalmarks;
    float S2percentage;
    int S2totalMaximumMarks;
    public void S2totalmarks(){
        S2totalmarks = S2sub1+S2sub2+S2sub3;
        System.out.println("Sem 2 total marks = " +S2totalmarks);
    }
    public void S2totalMaximumMarks(){
        S2totalMaximumMarks = 3*100;

    }
    public void S2percentage(){
        S2percentage = (S2totalmarks*100)/S2totalMaximumMarks;
        System.out.println("Sem 2 percentage = "+S2percentage);
    }

    
}
