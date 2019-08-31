package training.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList("1", "2", "3");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) if (iterator.next().equalsIgnoreCase("1")) {
            System.out.println(iterator.next());
        }
    }
}
