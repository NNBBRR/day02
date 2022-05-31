package myapp.core;

import java.util.*;

public class DataStruc {

    public static void main(String[] args) {

        List<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(50);
        intList.add(2, 15);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%d\n", i , intList.get(i));
        }



}
}
