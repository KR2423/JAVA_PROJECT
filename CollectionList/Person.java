package CollectionList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.Arrays;

public class Person {
    public static void main(String[] args) {
        List<Integer> AList = new ArrayList<>();
        AList.add(-1);
        AList.add(-2);
        AList.add(-3);
        AList.add(-4);
        System.out.println(AList);
        ArrayList<String> AList2 = new ArrayList<>();
        //AList.size();
        System.out.println(AList.size());

        //AList.get(2);
        System.out.println(AList.get(2));
        //AList.toArray();
        System.out.println(AList.toArray());


        //Vector
        List<String> list = new Vector<>();
        list.add("Keerthi");
        System.out.println(list);
        Vector<String> list1 = new Vector<>();
        list1.add("Reddy");
                System.out.println(list1);


        //Stack
        
        List<Integer> slist = new Stack<>();
        slist.add(10);
                System.out.println(slist);

        Stack<Integer> slist2 = new Stack<>();
        System.out.println("This is Stack list");
        slist2.push(20);
        slist2.push(30);
        slist2.push(40);
        slist2.push(50);
        slist2.push(60);
        System.out.println(slist2);
        //;
        System.out.println(slist2.peek());


        LinkedList<Integer> Llist = new LinkedList<>();
        //Llist.add(100);
                //System.out.println(Llist);
        Llist.addFirst(100);
        System.out.println(Llist);
        Llist.add(200);
        Llist.add(300);
        Llist.add(2, 250);


        Llist.addLast(400);
        System.out.println(Llist);





    }
    
}
