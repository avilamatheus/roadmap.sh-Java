package singlelinkedlist;

import java.util.List;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Construtor que recebe uma lista de itens para inicializar a LinkedList
    LinkedList(List<T> items) {
        this.head = null;
        this.tail = null;
        this.size = 0;

        for (T item : items) {
            Node<T> newNode = new Node<>(item);
            if (head == null) {
                this.head = newNode;
            } else {
                this.tail.setNextNode(newNode);
            }
            this.tail = newNode;
            this.size++;
        }
    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    public int size() {
        return this.size;
    }

    public void insertAtEnd(Node<T> node) {
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNextNode(node);
        }
        tail = node;
        this.size++;
    }

    public void insertAtBegin(Node<T> node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            Node<T> auxNode = head;
            head = node;
            node.setNextNode(auxNode);
        }
        this.size++;
    }

    public void insertNode(Node<T> node, int index) {
        if(index < 0 || index > this.size) {
            throw new IllegalArgumentException("O index informado é invalido, deve ser dentro da faixa [0, tamanho].");
        }

        if(index == 0) {
            insertAtBegin(node);
        } else if (index == this.size){
            insertAtEnd(node);
        } else {
            int auxIndex = 1;
            Node<T> previousNode = head;
            Node<T> nextNode = head.getNextNode();

            while (auxIndex != index) {
                previousNode = nextNode;
                nextNode = previousNode.getNextNode();
                auxIndex++;
            }
            previousNode.setNextNode(node);
            node.setNextNode(nextNode);
            this.size++;
        }
    }

    public boolean contains(T data) {
        if(isEmpty()) {
            return false;
        }
        Node<T> auxNode = head;
        while (auxNode != null) {
            if(auxNode.getData().equals(data)) {
                return true;
            }
            auxNode = auxNode.getNextNode();
        }

        return false;
    }

    public int index(T data) {
        if(isEmpty()) {
            throw new IllegalStateException("A Linked List está vazia");
        }
        if(!contains(data)) {
            throw new IllegalArgumentException("O Dado não existe na Linked List");
        }

        int index = 0;
        Node<T> auxNode = head;
        while (auxNode != null) {
            if(auxNode.getData().equals(data)) {
                break;
            }
            auxNode = auxNode.getNextNode();
            index++;
        }
        return index;
    }

    public void remove(T data) {
        int index = index(data);
        removeFrom(index);
    }

    public T removeFrom(int index) {

        if(isEmpty()) {
            throw new IllegalStateException("A Linked List está vazia");
        }

        if(index < 0 || index > (this.size-1)) {
            throw new IllegalArgumentException("O index informado é invalido, deve ser dentro da faixa [0, tamanho-1].");
        }

        if(index == 0) {
            return removeFromTheBegin();
        } else if (index == (this.size-1)) {
            return removeFromTheEnd();
        } else {
            int auxIndex = 1;
            Node<T> previousNode = head;
            Node<T> nodeToBeDeleted = head.getNextNode();
            Node<T> nextNode = nodeToBeDeleted.getNextNode();

            while (auxIndex != index) {
                previousNode = nodeToBeDeleted;
                nodeToBeDeleted = nextNode;
                nextNode = nextNode.getNextNode();
                auxIndex++;
            }
            previousNode.setNextNode(nextNode);
            this.size--;

            return nodeToBeDeleted.getData();
        }
    }

    public T removeFromTheEnd() {
        T data;

        if(isEmpty()) {
            throw new IllegalStateException("A Linked List está vazia");
        }

        data = tail.getData();

        if(this.size == 1) {
            head = null;
            tail = null;
        } else {
            Node<T> auxNode = head;
            while (auxNode.getNextNode() != tail) {
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(null);
            tail = auxNode;
        }
        this.size--;
        return data;
    }

    public T removeFromTheBegin() {
        T data;

        if(isEmpty()) {
            throw new IllegalStateException("A Linked List está vazia");
        }

        data = head.getData();

        if(this.size == 1) {

            head = null;
            tail = null;
        } else {
            Node<T> nodeToBeRemoved = head;
            head = nodeToBeRemoved.getNextNode();
        }
        this.size--;
        return data;
    }
}
