package singleLinkedList;

import common.IntPair;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private static LinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new LinkedList<>();
    }

    private static void addTestNodes(int quantity) {
        Node<Integer> head = null;
        Node<Integer> current = null;

        for (int i = 1; i <= quantity; i++) {
            Node<Integer> newNode = new Node<>(i);

            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.setNextNode(newNode);
                current = newNode;
            }
        }

        myLinkedList.setHead(head);
        myLinkedList.setTail(current);
        myLinkedList.size = quantity;
    }

    @Test
    void isEmpty() {
        Assertions.assertTrue(myLinkedList.isEmpty());
    }

    @Test
    void isNotEmpty() {
        addTestNodes(1);
        Assertions.assertFalse(myLinkedList.isEmpty());
    }

    @Test
    void sizeZero() {
        assertEquals(0, myLinkedList.size());
    }

    @Test
    void sizeNotZero() {
        int numberOfTestNodes = 2;
        addTestNodes(numberOfTestNodes);
        assertEquals(numberOfTestNodes, myLinkedList.size());
    }

    @Test
    void containsSingleNode() {
        int data = 999;
        Node<Integer> node = new Node<>(data);
        myLinkedList.setHead(node);
        myLinkedList.setTail(node);
        assertTrue(myLinkedList.contains(data));
    }

    @Test
    void containsMultipleNodes() {
        addTestNodes(3);
        assertTrue(myLinkedList.contains(1));
        assertTrue(myLinkedList.contains(2));
        assertTrue(myLinkedList.contains(3));
        assertEquals(3, myLinkedList.size());
    }

    @Test
    void indexInEmptyList() {
        // Testar exceção em uma lista vazia
        assertThrows(IllegalStateException.class, () -> myLinkedList.index(1));
    }

    @Test
    void indexForNonexistentElement(){
        addTestNodes(3);
        // Testar exceção para um dado não presente na lista
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.index(4));
    }

    @Test
    void indexForExistingElements() {
        addTestNodes(3);
        assertEquals(0, myLinkedList.index(1));
        assertEquals(1, myLinkedList.index(2));
        assertEquals(2, myLinkedList.index(3));
    }

    @Test
    void addSingleNodeToTheBegin() {
        addTestNodes(3);

        int data = 4;
        myLinkedList.insertAtBegin(new Node<>(data));

        assertTrue(myLinkedList.contains(data));
        assertEquals(0, myLinkedList.index(data));
        assertEquals(4, myLinkedList.size());
    }

    @Test
    void addSingleNodeToTheEnd() {
        addTestNodes(3);

        int data = 4;
        myLinkedList.insertAtEnd(new Node<>(data));
        assertTrue(myLinkedList.contains(data));
        assertEquals(3, myLinkedList.index(data));
        assertEquals(4, myLinkedList.size());
    }

    @Test
    void addMultipleNodesToTheBegin() {
        List<IntPair> intPairList = new ArrayList<>();

        int numOfNodes = 100;

        for (int i = 1; i <= numOfNodes; i++) {
            intPairList.add(new IntPair(i, numOfNodes - i));
        }

        for (IntPair intPair : intPairList) {
            myLinkedList.insertAtBegin(new Node<>(intPair.getValue()));
        }

        assertEquals(intPairList.size(), myLinkedList.size());

        for (IntPair intPair : intPairList) {
            assertTrue(myLinkedList.contains(intPair.getValue()));
        }

        for (IntPair intPair : intPairList) {
            assertEquals(intPair.getExpectedPosition(), myLinkedList.index(intPair.getValue()));
        }

    }

    @Test
    void addMultipleNodesToTheEnd() {
        List<IntPair> intPairList = new ArrayList<>();

        int numOfNodes = 100;

        for (int i = 1; i <= numOfNodes; i++) {
            intPairList.add(new IntPair(i, i-1));
        }

        for (IntPair intPair : intPairList) {
            myLinkedList.insertAtEnd(new Node<>(intPair.getValue()));
        }

        assertEquals(intPairList.size(), myLinkedList.size());

        for (IntPair intPair : intPairList) {
            assertTrue(myLinkedList.contains(intPair.getValue()));
        }

        for (IntPair intPair : intPairList) {
            assertEquals(intPair.getExpectedPosition(), myLinkedList.index(intPair.getValue()));
        }

    }

    @Test
    void addSingleNodeAtInvalidPosition() {
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.insertNode(new Node<>(4), -1));
        addTestNodes(1);
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.insertNode(new Node<>(4), 4));
    }

    @Test
    void addSingleNodeAtTheMiddle() {
        addTestNodes(10);

        int data = 2024;
        myLinkedList.insertNode(new Node<>(data), 5);

        assertEquals(11, myLinkedList.size());
        assertTrue(myLinkedList.contains(data));

        assertEquals(0, myLinkedList.index(1));
        assertEquals(1, myLinkedList.index(2));
        assertEquals(2, myLinkedList.index(3));
        assertEquals(3, myLinkedList.index(4));
        assertEquals(5, myLinkedList.index(data));
        assertEquals(6, myLinkedList.index(6));
        assertEquals(7, myLinkedList.index(7));
        assertEquals(8, myLinkedList.index(8));
        assertEquals(9, myLinkedList.index(9));
        assertEquals(10, myLinkedList.index(10));
    }

    @Test
    void addMultipleNodesAtSpecificPositions() {
        List<IntPair> intPairList = new ArrayList<>();
        intPairList.add(new IntPair(1, 0, 1));
        intPairList.add(new IntPair(2, 1, 2));
        intPairList.add(new IntPair(3, 0, 0));
        intPairList.add(new IntPair(4, 3, 4));
        intPairList.add(new IntPair(5, 4, 5));
        intPairList.add(new IntPair(6, 3, 3));

        for (IntPair intPair : intPairList) {
            myLinkedList.insertNode(new Node<>(intPair.getValue()), intPair.getAddPosition());
        }

        assertEquals(intPairList.size(), myLinkedList.size());

        for (IntPair intPair : intPairList) {
            assertTrue(myLinkedList.contains(intPair.getValue()));
        }

        for (IntPair intPair : intPairList) {
            assertEquals(intPair.getExpectedPosition(), myLinkedList.index(intPair.getValue()));
        }
    }

    @Test
    void removeNodeFromTheBeginWithEmptyLinkedList() {
        assertThrows(IllegalStateException.class, () ->  myLinkedList.removeFromTheBegin());
    }

    @Test
    void removeNodeFromTheEndWithEmptyLinkedList() {
        assertThrows(IllegalStateException.class, () ->  myLinkedList.removeFromTheEnd());
    }

    @Test
    void removeNodeFromTheBegin() {
        addTestNodes(2);
        int data = myLinkedList.removeFromTheBegin();
        assertFalse(myLinkedList.contains(1));
        assertEquals(1, myLinkedList.size());
        assertEquals(1, data);


        data = myLinkedList.removeFromTheBegin();
        assertFalse(myLinkedList.contains(2));
        assertEquals(0, myLinkedList.size());
        assertEquals(2, data);

        addTestNodes(10);
        int size = 10;
        for (int i = 1; i<11; i++) {
            int dataAux = myLinkedList.removeFromTheBegin();
            size--;
            assertFalse(myLinkedList.contains(i));
            assertEquals(size, myLinkedList.size());
            assertEquals(i, dataAux);
        }
    }

    @Test
    void removeNodeFromTheEnd() {
        addTestNodes(2);

        int data = myLinkedList.removeFromTheEnd();
        assertFalse(myLinkedList.contains(2));
        assertEquals(1, myLinkedList.size());
        assertEquals(2, data);

        data = myLinkedList.removeFromTheEnd();
        assertFalse(myLinkedList.contains(1));
        assertEquals(0, myLinkedList.size());
        assertEquals(1, data);

        addTestNodes(10);
        int size = 10;
        for (int i = 10; i>0; i--) {
            int dataAux = myLinkedList.removeFromTheEnd();
            size--;
            assertFalse(myLinkedList.contains(i));
            assertEquals(size, myLinkedList.size());
            assertEquals(i, dataAux);
        }
    }

    @Test
    void removeFromInvalidIndex() {
        assertThrows(IllegalStateException.class, () ->
                myLinkedList.removeFrom(4));
        addTestNodes(3);

        assertThrows(IllegalArgumentException.class, () ->
                myLinkedList.removeFrom(-1));
        assertThrows(IllegalArgumentException.class, () ->
                myLinkedList.removeFrom(4));
    }

    @Test
    void removeNodeFromIndex() {
        addTestNodes(10);

        int data = myLinkedList.removeFrom(0);
        assertFalse(myLinkedList.contains(1));
        assertEquals(9, myLinkedList.size());
        assertEquals(1, data);

        data = myLinkedList.removeFrom(8);
        assertFalse(myLinkedList.contains(10));
        assertEquals(8, myLinkedList.size());
        assertEquals(10, data);

        //2, 3, 4, 5, 6, 7, 8, 9
        //0, 1, 2, 3, 4, 5, 6, 7

        data = myLinkedList.removeFrom(4);
        assertFalse(myLinkedList.contains(6));
        assertEquals(7, myLinkedList.size());
        assertEquals(6, data);
    }

    @Test
    void removeNodeGivenInvalidData() {
        // Testar exceção em uma lista vazia
        assertThrows(IllegalStateException.class, () -> myLinkedList.remove(1));

        addTestNodes(3);

        // Testar exceção para um dado não presente na lista
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.remove(4));
    }

    @Test
    void removeNodeGivenData() {

        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(1);
        Node<Integer> node3 = new Node<>(1);

        myLinkedList.setHead(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        myLinkedList.setTail(node3);
        myLinkedList.size = 3;

        myLinkedList.remove(1);
        assertEquals(2, myLinkedList.size());

        myLinkedList.remove(1);
        assertEquals(1, myLinkedList.size());

        myLinkedList.remove(1);
        assertEquals(0, myLinkedList.size());


        addTestNodes(10);
        int size = 10;
        for (int i = 10; i>0; i--) {
            myLinkedList.remove(i);
            size--;
            assertFalse(myLinkedList.contains(i));
            assertEquals(size, myLinkedList.size());
        }

    }

}
