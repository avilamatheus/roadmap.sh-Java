package singlelinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NodeTest {

    @Test
    void nodeConstructorWithoutData() {
        Node<Integer> node = new Node<>();
        Assertions.assertNull(node.data);
        Assertions.assertNull(node.nextNode);
    }

    @Test
    void nodeConstructorWithData(){
        Integer data = 30;
        Node<Integer> node = new Node<>(data);
        Assertions.assertEquals(data, node.data);
        Assertions.assertNull(node.nextNode);
    }

    @Test
    void getNodeData() {
        String data = "nodeData";
        Node<String> node = new Node<>(data);
        String result = node.getData();
        Assertions.assertEquals(data, result);
    }

    @Test
    void setNodeData(){
        String newData = "newData";

        Node<String> node = new Node<>("oldData");
        node.setData(newData);

        Assertions.assertEquals(newData, node.data);
    }

    @Test
    void setNextNode(){
        Node<Integer> nodeOne = new Node<>(1);
        Node<Integer> nodeTwo = new Node<>(2);

        nodeOne.setNextNode(nodeTwo);

        Assertions.assertEquals(nodeTwo, nodeOne.nextNode);
    }

    @Test
    void getNextNode() {
        Node<Integer> nodeOne = new Node<>(1);
        Assertions.assertNull(nodeOne.getNextNode());

        Node<Integer> nodeTwo = new Node<>(2);
        nodeOne.nextNode = nodeTwo;

        Assertions.assertEquals(nodeTwo, nodeOne.getNextNode());
    }

}
