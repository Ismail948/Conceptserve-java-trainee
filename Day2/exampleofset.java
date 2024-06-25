import java.util.*;
public class exampleofset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(3);
        Set<Integer> abc=new HashSet<Integer>();
        abc.add(2);
        abc.add(9);
        abc.add(7);
        set.addAll(abc);
        Set<Integer> def=new HashSet<>();
        def.addAll(abc);
        def.addAll(set);
        System.out.println("Helloooooo"+def);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

    }
}
