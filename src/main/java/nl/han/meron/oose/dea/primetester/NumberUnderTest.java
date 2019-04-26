package nl.han.meron.oose.dea.primetester;

public class NumberUnderTest {

    private int number;

    public synchronized int getNumber() {
        return number++;
    }
}
