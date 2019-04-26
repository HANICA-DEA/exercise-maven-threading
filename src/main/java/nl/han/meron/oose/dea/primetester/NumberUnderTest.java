package nl.han.meron.oose.dea.primetester;

public class NumberUnderTest {

    private int number = 0;

    public synchronized int getNumber() {
        return number++;
    }
}
