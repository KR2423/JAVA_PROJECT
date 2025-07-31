package Inheritance.StudentMarks;

public class StudentTest {
    int finalmarks;
    public static void main(String[] args) {
        Sem6 S6 = new Sem6();
        S6.setS1sub1(72);//S1sub1 = 72;
        S6.setS1sub2(56);//S1sub2 = 89;
        S6.setS1sub3(67);//S1sub3 = 92;
        S6.noOfSub=3;
        S6.S1totalMarks(S6.getS1sub1(),S6.getS1sub2(),S6.getS1sub3());
        S6.S1Totalmaximummarks = 300;
        S6.S1percentage();
        S6.S1totalmaximummarks(S6.noOfSub);
        System.out.println("This is Sem1 Marks");
        System.out.println("Sub1 = "+S6.getS1sub1()+" Sub2 = "+S6.getS1sub2()+" Sub3 = "+S6.getS1sub3());

        S6.S2sub1=86;
        S6.S2sub2=96;
        S6.S2sub3=89;
        S6.S2totalMaximumMarks=300;
        S6.S2totalmarks();
        S6.S2percentage();
        S6.S2totalMaximumMarks();
        System.out.println("This is Sem2 marks");
        System.out.println("Sub1= "+S6.S2sub1+" Sub2= "+S6.S2sub2+" Sub3= "+S6.S2sub3);

        S6.S3sub1=83;
        S6.S3sub2=91;
        S6.S3sub3=77;
        S6.S3totalMaximumMarks=300;
        S6.S3totalmarks();
        S6.S3percentage();
        S6.S3totalMaximumMarks();
        System.out.println("this is Sem 3 marks");
        System.out.println("Sub1= "+S6.S3sub1+" Sub2= "+S6.S3sub2+" Sub3= "+S6.S3sub3);

        S6.S4sub1=85;
        S6.S4sub2=75;
        S6.S4sub3=81;
        S6.S4sub4=70;
        S6.S4totalMaximumMarks=400;
        S6.S4totalmarks();
        S6.S4percentage();
        S6.S4totalMaximumMarks();
        System.out.println("this is Sem 4 marks");
        System.out.println("Sub1= "+S6.S4sub1+" Sub2= "+S6.S4sub2+" Sub3= "+S6.S4sub3+" Sub4= "+S6.S4sub4);

        S6.S5sub1=77;
        S6.S5sub2=88;
        S6.S5sub3=94;
        S6.S5sub4=90;
        S6.S5totalMaximumMarks=400;
        S6.S5totalmarks();
        S6.S5percentage();
        S6.S5totalMaximumMarks();
        System.out.println("this is Sem 5 marks");
        System.out.println("Sub1= "+S6.S5sub1+" Sub2= "+S6.S5sub2+" Sub3= "+S6.S5sub3+" Sub4= "+S6.S5sub4);

        S6.S6sub1=91;
        S6.S6sub2=84;
        S6.S6sub3=93;
        S6.S6sub4=95;
        S6.S6totalMaximumMarks=400;
        S6.S6totalmarks();
        S6.S6percentage();
        S6.S6totalMaximumMarks();
        
        System.out.println("this is Sem 6 marks");
        System.out.println("Sub1= "+S6.S6sub1+" Sub2= "+S6.S6sub2+" Sub3= "+S6.S6sub3+" Sub4= "+S6.S6sub4);
        S6.finalmarks();

    






    }
    
}
