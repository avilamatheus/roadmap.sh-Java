package stack;

import java.util.List;

public class Stack<T> {

    private final LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    // Construtor que recebe uma lista de itens para inicializar a Stack, utilizado em testes
    Stack(List<T> items) {
        this.linkedList = new LinkedList<>();
        for (T item : items) {
            Node<T> newNode = new Node<>(item);
            linkedList.insertAtBegin(newNode);
        }
    }

    public LinkedList<T> getLinkedList() {
        return this.linkedList;
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public Node<T> top() {
        if(linkedList.isEmpty()) {
            throw new IllegalStateException();
        }
        return linkedList.getHead();
    }

    public void push(Node<T> node) {
        linkedList.insertAtBegin(node);
    }

    public void push(T data) {
        linkedList.insertAtBegin(new Node<>(data));
    }

    public T pop(){
        if(linkedList.isEmpty()) {
            throw new IllegalStateException();
        }
        return linkedList.removeFromTheBegin();
    }
}
