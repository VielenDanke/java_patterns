package kz.danke.patterns.structure.bridge;

public class Client {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();
        FifoCollection<Integer> collection = new Queue<>(linkedList);
        collection.offer(1);
        Integer poll = collection.poll();
        System.out.println(poll);
    }
}
