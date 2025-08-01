package Inheritance.StudentMarks;

public class Sem5 extends Sem4 {
    int S5sub1;
    int S5sub2;
    int S5sub3;
    int S5sub4;
    int S5totalmarks;
    int S5totalMaximumMarks;
    float S5percentage;
    public void S5totalmarks(){
        S5totalmarks = S5sub1+S5sub2+S5sub3+S5sub4;
        System.out.println("Sem 5 Total Marks = "+S5totalmarks);
    }
    public void S5totalMaximumMarks(){
        S5totalMaximumMarks=4*100;
    }
    public void S5percentage(){
        S5percentage = (S5totalmarks*100)/S5totalMaximumMarks;
        System.out.println("Sem 5 Percentage is "+ S5percentage);
    }
    
}
