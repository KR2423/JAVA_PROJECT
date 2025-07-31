package Inheritance.StudentMarks;

public class Sem6 extends Sem5 {
    int S6sub1;
    int S6sub2;
    int S6sub3;
    int S6sub4;
    int S6totalmarks;
    int finaltotalmarks;
    int finalMaxMarks;
    int finalpercentage;
    int S6totalMaximumMarks;
    float S6percentage;

    public void S6totalmarks(){
        S6totalmarks = S6sub1+S6sub2+S6sub3+S6sub4;
        System.out.println("Sem 6 Total Marks = "+S6totalmarks);
    }
    public void S6totalMaximumMarks(){
        S6totalMaximumMarks=4*100;
    }
    public void S6percentage(){
        S6percentage = (S6totalmarks*100)/S6totalMaximumMarks;
        System.out.println("Sem 6 Percentage is "+ S6percentage);
    }
    public void finalmarks(){
        finaltotalmarks = S1totalmarks+S2totalmarks+S3totalmarks+S4totalmarks+S5totalmarks+S6totalmarks;
        finalMaxMarks = S1Totalmaximummarks+S2totalMaximumMarks+S3totalMaximumMarks+S4totalMaximumMarks+S5totalMaximumMarks+S6totalMaximumMarks;
        finalpercentage = (finaltotalmarks*100)/finalMaxMarks;
        System.out.println("Final Percentage "+finalpercentage);


    }

    
}
