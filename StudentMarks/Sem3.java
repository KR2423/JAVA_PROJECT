package Inheritance.StudentMarks;

public class Sem3 extends Sem2 {
    int S3sub1;
    int S3sub2;
    int S3sub3;
    int S3totalmarks;
    int S3totalMaximumMarks;
    float S3percentage;
    public void S3totalmarks(){
        S3totalmarks = S3sub1+S3sub2+S3sub3;
        System.out.println("Sem 3 Total Marks = "+S3totalmarks);
    }
    public void S3totalMaximumMarks(){
        S3totalMaximumMarks = 3*100;
    }
    public void S3percentage(){
        S3percentage = (S3totalmarks*100)/S3totalMaximumMarks;
        System.out.println("Sem 3 total percentage = "+S3percentage);
    }
    
}
