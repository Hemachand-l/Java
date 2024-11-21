package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("orange");
        Fruits.add("Grapes");
        System.out.println("Initial values: "+Fruits);
        System.out.println("First element: "+Fruits.get(1));
        System.out.println("Remove element: "+Fruits.remove(2));
        System.out.println(Fruits);
        Fruits.add("Pineapple");
        Fruits.add("Berry");
        System.out.println(Fruits);
        for (String i : Fruits){
            System.out.println(i);
        }
        Iterator<String> Fruits1 = Fruits.iterator();
        while (Fruits1.hasNext())
        {
            System.out.println(Fruits1.next());
        }
    }
}
