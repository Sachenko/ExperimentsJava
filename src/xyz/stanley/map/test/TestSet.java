package xyz.stanley.map.test;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        Set<Integer> setInteger1 = new HashSet<>();
        Set<Integer> setInteger2 = new HashSet<>();
        Set<Integer> union = new HashSet<>(setInteger1);

        for (int i = 0; i <= 10; i ++)
            setInteger1.add(i);

        for (int i = 5; i <= 15; i ++)
            setInteger2.add(i);

/*        //union - объединение множеств

        setInteger2.addAll(setInteger1);
        union.addAll(setInteger2);

        System.out.println(setInteger1);
        System.out.println(setInteger2);
        System.out.println(union); */

        // intersection - пересечение множеств

/*        Set<Integer> intersection = new HashSet<>(setInteger1);
        intersection.retainAll(setInteger2);
        System.out.println(intersection); */

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(setInteger1);
        difference.removeAll(setInteger2);
        System.out.println(difference);

//        System.out.println(setInteger1);
/*
        hashSet.add("Stanley");
        hashSet.add("Petr");
        hashSet.add("Zorro");
        hashSet.add("Svetlana");
        hashSet.add("Vasiliy");
        hashSet.add("Dmitriy");
        hashSet.add("Stanley");
        hashSet.add("Donald");

*/




//        System.out.println(hashSet);

 /*       for(String name : hashSet) {
            System.out.println(name);
        }*/

/*        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Donald"));
        System.out.println(hashSet.isEmpty());*/

    }
}
