package common;

public class IntPair {
    private int value;
    private int expectedPosition;
    private int addPosition;

    public IntPair(int value, int expectedPosition) {
        this.value = value;
        this.expectedPosition = expectedPosition;
    }

    public IntPair(int value, int addPosition, int expectedPosition) {
        this.value = value;
        this.addPosition = addPosition;
        this.expectedPosition = expectedPosition;
    }

    public int getValue() {
        return value;
    }

    public int getExpectedPosition() {
        return expectedPosition;
    }

    public int getAddPosition() {
        return addPosition;
    }
}
