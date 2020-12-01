package linkedListNewMy;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(7);
        myLinkedList.add(15);
        myLinkedList.add(24);
        myLinkedList.add(21);
        myLinkedList.add(19);
        System.out.println(myLinkedList);
        System.out.println( myLinkedList.get(2));
    }
}
