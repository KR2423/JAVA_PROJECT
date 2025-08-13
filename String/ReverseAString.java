package String;

public class ReverseAString {
    
public static void main(String[] args) {
    String name = "Keerthi";
    String reverse = " ";
    System.out.println("Reverse String is ");

    for(int i =name.length()-1;i>=0;i--){
        reverse += name.charAt(i);
        //System.out.println(reverse); --> 
        //If you write print statement here it prints every character in the reverse string which is
        // adds a value and stores back in the same varaiable 
        //i.e reverse = reverse + name.charAt(i) which adds the strings and stores in it.
                    //Reverse String is
                    //i
                    //  ih
                    //  iht
                    //  ihtr
                    //  ihtre
                    //  ihtree
                    //  ihtreeK



    }
    System.out.println(reverse);
    //This gives the o/p as 
    // Reverse String is
    // ihtreeK
}
    
    
}
