package linkedListNewMy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLinkedList {
    private Node head; // Сыылка на первый узел
    private int size; // Размер

    public void add(int value) { //Метод добавления и создания листа в качестве параметра принимает размер
        //первое добавление в список
        if (head == null) {  //Если ссылка хеад пустая тогда выполнить код ниже
            head = new Node(value); // Создание Узла и сохранение значения.
        } else {
            Node temp = head; // Temporary Временный узел которому мы присваиваем значение головного узла
            while(temp.getNext() != null) { //Пока не дойдет до последнего узела выполняет метод temp.getNext
                temp = temp.getNext(); // Присвоение поледнего узла переменной темп
            }
            temp.setNext(new Node(value)); // метод выполняет двойное назначение, создает новый объект Узла со новым значением
            // и присваивает это значение в поле некст предыдущего объекта в котором было найдено пустое значение поля next
        }
        size ++;
    }

    public int get (int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if(currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove (int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex  == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }


        }
    }

    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;

        while(temp != null) {
            int i = idx++;
            result[i] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value; //Значение которое добавляется в мой линкедЛист
        private Node next; //ссылка на следующий узел

        public Node(int value) { //Конструктор класса Node принмающий значение
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
