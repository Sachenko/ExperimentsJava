package xyz.stanley.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map <Integer, String> hashMap = new HashMap<>();
        //Внутри не гарантируется порядок, полный рандом
        Map <Integer, String> linledHashMap = new LinkedHashMap<>();
        //По порядку добавления
        Map <Integer, String> treeMap = new TreeMap<>();
        // Сортировка по ключам

        testMap(treeMap);

    }

    public static void testMap (Map<Integer,String> map) {
        map.put(30, "Bob");
        map.put(46, "Djo");
        map.put(12, "Tom");
        map.put(156, "Tim");
        map.put(0, "Nike");
        map.put(1000, "Gib");

        for(Map.Entry <Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }

}




/*        Map<String, String> fish = new HashMap<>();

        fish.put("млекопитающие", "дельфин");
        fish.put("пресноводное", "белуга");
        fish.put("беспозвоночное", "молюск");

        for (Map.Entry lalala : fish.entrySet()) {
            System.out.println(lalala.getKey() + " : " + lalala.getValue());
        }*/


/*        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Two");
        map.put(3, "Three");


        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/