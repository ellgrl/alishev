package day12;

import java.util.ArrayList;
import java.util.List;

public class Day12_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("Tesla");
        list.add("Toyota");

        System.out.println(list);
        list.add(2,"Mercedes");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
