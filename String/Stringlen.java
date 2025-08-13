package String;

public class Stringlen {
    public static void main(String[] args) {
        String s1 = "Keerthi";
        String s2 = "Arun";
        int age = 24;
        float score = 93.456f;
        int age2 = 22;
        float score2 = 86.2349f;
        String s3 = new String("Keerthi");
        System.out.println("My name is "+s1+","+"New String is "+s3);
        System.out.println("Length "+s1.length());
        System.out.println("Character At 3 is "+s2.charAt(3));

        //In Java, hashCode() gives an integer 
        //that helps quickly locate objects in hash-based collections (like HashMap, HashSet).
        //Think of it as a numeric shortcut to find something, instead of checking everything one-by-one.
        System.out.println("Hashcode is "+s2.hashCode());

        //tring formatting lets you insert values into a string in a 
        //controlled way — you decide where values go and how they look (decimals, padding, alignment, etc.).
        //%s → "Put a name here" (string)

        // %d → "Put an integer here" (whole number)

        // %.2f → "Put a decimal number here, but only keep 2 digits after the point"

        String message = String.format("My name is %s.My age is %d.I scored %.2f in my Btech.",s2,age2,score2);
        System.out.println("Message = "+ message);

        


        //System.out.println("My name is %s.My age is %d.I scored %.2f "+s2.formatted(s1,age,score));

    }
    
}
