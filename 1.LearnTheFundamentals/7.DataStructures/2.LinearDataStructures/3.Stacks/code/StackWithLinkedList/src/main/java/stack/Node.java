package stack;

public class Node<T> {
    protected T data;
    protected Node<T> nextNode;

    public Node(){}

    public Node(T data) {
        this.data = data;
        nextNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
