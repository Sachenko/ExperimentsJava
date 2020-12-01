package linkedListNewMy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedListAndArrayList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        //head -> [1] -> [2] -> [3] -> [4]

        List<Integer> arrayList = new ArrayList<>();
        //[1] [2] [3] [4] [5] [6] [7]

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

/*        for (int i = 0; i < 100000; i++)
            list.get(i); //ArrayList Очень быстро позволяет считывать данные  */

/*        for (int i = 0; i < 100000; i++)
            list.add(i); //LinkedList позволяет быстрее записать данные чем ArrayList по индексу
        // [] -> [0] -> [0][1] -> [0][1][2]...*/

/*        for (int i = 0; i < 100000; i++)
            list.add(0 , i); //ArrayList сильно проигрывает LinkedList по записи данных в начало
        // [] -> [0] -> [1][0] -> [2][1][0]...*/

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
