package nl.han.meron.oose.dea;

public class NumberUnderTest {

    private int number;

    public synchronized int getNumber() {
        return number++;
    }
}
