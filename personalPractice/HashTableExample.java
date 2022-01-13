package personalPractice;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(0, "OK");
        ht.put(1, "Yes");
        ht.put(2, "NO");
        ht.replace(1, "KEY");
        ht.remove(0);




        for (int i = 0; i <= ht.size(); i++) {

            System.out.println(ht.get(i));
            System.out.println("HI");
        }

        System.out.println(ht.size());
    }
}
