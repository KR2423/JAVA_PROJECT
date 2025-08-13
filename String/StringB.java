package String;

public class StringB {
    public static void main(String[] args) {
        
    
    StringBuffer sb = new StringBuffer();
    sb.append("Keerthi");
    //append() adds text to the end.
    sb.append("Reddy");
    sb.append("C");
    System.out.println(sb);

    //insert(index, text) adds text at the given position.
    //It shifts everything after that position to the right to make space.
    //Then it puts your new content in.
    sb.insert(7, " ");
    //Keerthi ReddyC - it adds space after 7 th letter
    System.out.println(sb);

    sb.insert(13, 23.4f);
    System.out.println(sb);

    sb.insert(18, false);
    System.out.println(sb);

    sb.replace(9, 13, "Cholleti");
    System.out.println(sb);

    StringBuffer s = new StringBuffer("H");
    s.append("ello");
    //System.out.println(s);
    s.replace(1, 3, "CATCH");
            System.out.println(s);


    //replace(int start, int end, String str)
    //start: The index where the replacement begins — inclusive (the character at this position is replaced).
    //end: The index where the replacement ends — exclusive (the character at this position is NOT replaced; replacement stops just before it)
    //str: The new string you want to put in that place.

     s.delete(2, 4);
     //start - inclusive
     //end - exclusive
        System.out.println(s);

    s.reverse();
    System.out.println(s);

    StringBuffer s1 = new StringBuffer("Heaven");
    System.out.println(s1);

    StringBuffer s2 = new StringBuffer();
    s2.append(" xcvbnmki6resdcvbnjk,mnbvcdertyuikjh");
        System.out.println(s2);

    StringBuffer s3 = new StringBuffer(10);
    s3.append("abcdefghijth");
    System.out.println(s3);










    }
}
