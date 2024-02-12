package stack;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private static LinkedList<Integer> myLinkedList;

    @BeforeEach
    void setUp() {
        myLinkedList = new LinkedList<>();
    }

    @Test
    void linkedListIsEmpty() {
        Assertions.assertTrue(myLinkedList.isEmpty());
    }

    @Test
    void linkedListIsNotEmpty() {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        myLinkedList = new LinkedList<>(items);

        Assertions.assertFalse(myLinkedList.isEmpty());
    }

    @Test
    void linkedListSizeIsZero() {
        assertEquals(0, myLinkedList.size());
    }

    @Test
    void linkedListSizeIsNotZero() {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5);

        myLinkedList = new LinkedList<>(items);

        assertEquals(5, myLinkedList.size());
    }

    @Test
    void linkedListContainsSingleNode() {
        List<Integer> items = Arrays.asList(999);

        myLinkedList = new LinkedList<>(items);

        assertTrue(myLinkedList.contains(999));
    }

    @Test
    void linkedListContainsMultipleNodes() {
        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        assertTrue(myLinkedList.contains(1));
        assertTrue(myLinkedList.contains(2));
        assertTrue(myLinkedList.contains(3));
    }

    @Test
    void indexInEmptyListThrowsException() {
        // Testar exceção em uma lista vazia
        assertThrows(IllegalStateException.class, () -> myLinkedList.index(1));
    }

    @Test
    void indexForNonexistentElementThrowsException(){
        List<Integer> items = Arrays.asList(1, 2, 3);
        myLinkedList = new LinkedList<>(items);
        // Testar exceção para um dado não presente na lista
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.index(4));
    }

    @Test
    void indexForExistingElements() {
        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        assertEquals(0, myLinkedList.index(1));
        assertEquals(1, myLinkedList.index(2));
        assertEquals(2, myLinkedList.index(3));
    }

    @Test
    void addSingleNodeToTheBegin() {
        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        Node<Integer> newNode = new Node<>(4);

        myLinkedList.insertAtBegin(newNode);

        Assertions.assertEquals(newNode, myLinkedList.getHead());
    }

    @Test
    void addSingleNodeToTheEnd() {
        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        Node<Integer> newNode = new Node<>(4);

        myLinkedList.insertAtEnd(newNode);

        Assertions.assertEquals(newNode, myLinkedList.getTail());
    }

    @Test
    void addSingleNodeAtInvalidPositions() {
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.insertNode(new Node<>(4), -1));
        List<Integer> items = Arrays.asList(1);
        myLinkedList = new LinkedList<>(items);
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.insertNode(new Node<>(4), 4));
    }

    @Test
    void addSingleNodeAtTheMiddle() {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        myLinkedList = new LinkedList<>(items);

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
    void removeNodeFromTheBeginWithEmptyLinkedListThrowsException() {
        assertThrows(IllegalStateException.class, () ->  myLinkedList.removeFromTheBegin());
    }

    @Test
    void removeNodeFromTheEndWithEmptyLinkedListThrowsException() {
        assertThrows(IllegalStateException.class, () ->  myLinkedList.removeFromTheEnd());
    }

    @Test
    void removeTwoNodesFromTheBegin() {
        List<Integer> items = Arrays.asList(1, 2);

        myLinkedList = new LinkedList<>(items);

        int data = myLinkedList.removeFromTheBegin();
        assertEquals(1, data);
        assertNotEquals(1, myLinkedList.getHead().getData());

        data = myLinkedList.removeFromTheBegin();
        assertEquals(2, data);
        assertNull(myLinkedList.getHead());
    }

    @Test
    void removeTwoNodesFromTheEnd() {
        List<Integer> items = Arrays.asList(1, 2);

        myLinkedList = new LinkedList<>(items);

        int data = myLinkedList.removeFromTheEnd();
        assertEquals(2, data);
        assertNotEquals(2, myLinkedList.getTail().getData());

        data = myLinkedList.removeFromTheEnd();
        assertEquals(1, data);
        assertNull(myLinkedList.getTail());
    }

    @Test
    void removeFromInvalidIndexThrowsException() {
        assertThrows(IllegalStateException.class, () ->
                myLinkedList.removeFrom(4));

        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        assertThrows(IllegalArgumentException.class, () ->
                myLinkedList.removeFrom(-1));
        assertThrows(IllegalArgumentException.class, () ->
                myLinkedList.removeFrom(4));
    }

    @Test
    void removeNodesFromSpecificIndex() {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        myLinkedList = new LinkedList<>(items);

        int data = myLinkedList.removeFrom(0);
        assertEquals(1, data);
        assertNotEquals(1, myLinkedList.getHead().getData());

        data = myLinkedList.removeFrom(8);
        assertEquals(10, data);
        assertNotEquals(1, myLinkedList.getTail().getData());

        data = myLinkedList.removeFrom(4);
        assertEquals(6, data);
    }

    @Test
    void removeNodeGivenInvalidDataThrowsException() {
        // Testar exceção em uma lista vazia
        assertThrows(IllegalStateException.class, () -> myLinkedList.remove(1));

        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        // Testar exceção para um dado não presente na lista
        assertThrows(IllegalArgumentException.class, () -> myLinkedList.remove(4));
    }

    @Test
    void removeNodeGivenData() {
        List<Integer> items = Arrays.asList(1, 2, 3);

        myLinkedList = new LinkedList<>(items);

        myLinkedList.remove(3);
        assertNotEquals(3, myLinkedList.getTail().getData());

    }
}
