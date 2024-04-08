package Hashing;
import java.util.*;
public class SimpleHashing {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(9);
        System.out.println(s);
        s.size();
        s.add(91);
        s.remove(9);
        s.clear();
        boolean empty = s.isEmpty();
        System.out.println("empty = " + empty);

    }
}
