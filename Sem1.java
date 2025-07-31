package Inheritance.StudentMarks;

public class Sem1 {
    //private static final int Totalmaximummarks = 0;
    private int S1sub1;
    private int S1sub2;
    private int S1sub3;
     int S1totalmarks;
    public int getS1sub1() {
        return S1sub1;
    }
     public void setS1sub1(int s1sub1) {
         S1sub1 = s1sub1;
     }
     public int getS1sub2() {
        return S1sub2;
    }
     public void setS1sub2(int s1sub2) {
         S1sub2 = s1sub2;
     }
     public int getS1sub3() {
         return S1sub3;
     }
     public void setS1sub3(int s1sub3) {
         S1sub3 = s1sub3;
     }
     int noOfSub;
     float Sem1percentage;
    int S1Totalmaximummarks;
    public void S1totalMarks(int S1, int S2, int S3){
       // int totalmarks; --> Declared inside a method, used outside 
       // Variable which is decleared inside the scope or method cannot be used outside of its method 
        S1totalmarks = S1+S2+S3;
        System.out.println("Sem 1 Total Marks = "+ S1totalmarks);
    }
    public void S1totalmaximummarks(int a){

    
        S1Totalmaximummarks = a*100;
    }
    public void S1percentage(){
        //float Sem1percentage;
        Sem1percentage = (S1totalmarks*100)/S1Totalmaximummarks;
        System.out.println("Sem 1 percentage = "+ Sem1percentage);
    }
    
}
