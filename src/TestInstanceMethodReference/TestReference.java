package TestInstanceMethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestReference {

    public static void main(String[] args) {

    /*    TestRefer testRefer = new TestRefer();
        int something = 22;
        testRefer.testPrint(something);

        System.out.println(testRefer.testPrintSomething());

        ArrayList<Integer> testArray = new ArrayList();
        for (int i = 0; i < 10; i ++) {
            testArray.add(i);
        }
        Integer ran = 1;*/
        /*System.out.println(testArray.toString());*/

        /*Перебирает переданную коллекцию,
         и выполняет лямбда-выражение action для каждого ее элемента.*/
        //testArray.forEach(random -> System.out.println(random));
//        testArray.forEach(System.out::println);

/*      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);*/


        List<Integer> numbers = Arrays.asList(1, 2, 5, 9, 11);
        numbers.stream().map(Math::addTen).forEach(System.out::println);

    }
}

class Math {
    static int addTen(int x) {
        return x + 10;
    }
}

