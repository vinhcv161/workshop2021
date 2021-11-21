package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterable {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        a.add("1");
        a.add(2);
        a.add(5);

        a.forEach(System.out::println);

        Iterator it = a.iterator();
        it.forEachRemaining(o -> {
            System.out.println(o);
        });

        Iterator it2 = a.iterator();
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}


class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
