package stack;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private static Stack<Integer> myStack;

    @BeforeEach
    void setUp() {
        myStack = new Stack<>();
    }

    @Test
    void stackIsEmpty() {
        Assertions.assertTrue(myStack.isEmpty());
    }

    @Test
    void stackIsNotEmpty() {
        List<Integer> items = Arrays.asList(1, 1, 1);
        myStack = new Stack<>(items);
        Assertions.assertFalse(myStack.isEmpty());
    }

    @Test
    void stackSizeIsZero() {
        Assertions.assertEquals(0, myStack.size());
    }

    @Test
    void stackSizeIsThree() {
        List<Integer> items = Arrays.asList(1, 2, 3);
        myStack = new Stack<>(items);
        Assertions.assertEquals(3, myStack.size());
    }

    @Test
    void topNodeAtEmptyStackThrowsException(){
        assertThrows(IllegalStateException.class, () -> myStack.top());
    }

    @Test
    void topNodeIsThree() {
        List<Integer> items = Arrays.asList(1, 2, 3);
        myStack = new Stack<>(items);
        Assertions.assertEquals(3, myStack.top().getData());
    }

    @Test
    void topNodeIsOne() {
        List<Integer> items = Arrays.asList(3, 2, 1);
        myStack = new Stack<>(items);
        Assertions.assertEquals(1, myStack.top().getData());
    }

    @Test
    void pushNodeToTheStack() {
        List<Integer> items = Arrays.asList(1, 2, 3);
        myStack = new Stack<>(items);

        Node<Integer> newNode = new Node<>(2024);
        myStack.push(newNode);
        Assertions.assertEquals(newNode, myStack.getLinkedList().getHead());
    }

    @Test
    void pushDataToTheStack() {
        List<Integer> items = Arrays.asList(1, 2, 3);
        myStack = new Stack<>(items);
        myStack.push(999);
        Assertions.assertEquals(999, myStack.getLinkedList().getHead().getData());
    }

    @Test
    void popAtEmptyStackThrowsException(){
        assertThrows(IllegalStateException.class, () -> myStack.pop());
    }

    @Test
    void popThreeItemsFromStack() {
        List<Integer> items = Arrays.asList(1, 2, 3);
        myStack = new Stack<>(items);

        for (int i = 3; i>0; i--) {
            Assertions.assertEquals(i, myStack.pop());
        }
    }
}
