package nl.han.meron.oose.dea.primetester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUnderTestTest {

    @Test
    void OneCallReturnsZero() {
        //setup
        NumberUnderTest nut = new NumberUnderTest();

        //test
        int result = nut.getNumber();

        //verify
        assertEquals(0, result);
    }

    @Test
    void FourCallsReturnsZeroThroughThree() {
        //setup
        NumberUnderTest nut = new NumberUnderTest();

        //test
        int result1 = nut.getNumber();
        int result2 = nut.getNumber();
        int result3 = nut.getNumber();
        int result4 = nut.getNumber();

        //verify
        assertEquals(0, result1);
        assertEquals(1, result2);
        assertEquals(2, result3);
        assertEquals(3, result4);
    }
}
