package nl.han.meron.oose.dea;

public class NumberUnderTest {

    private int number = 0;

    public synchronized int getNumber() {
        return number++;
    }
}
