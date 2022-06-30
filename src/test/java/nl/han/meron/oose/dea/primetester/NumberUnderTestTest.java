package nl.han.meron.oose.dea.primetester;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberUnderTestTest {

    NumberUnderTest sut;

    @BeforeEach
    void setup() {
        // Arrange.
        sut = new NumberUnderTest();
    }

    @Test
    void oneCallReturnsZero() {
        // Act
        int actual = sut.getNumber();

        // Assert
        assertEquals(0, actual);
    }

    @Test
    void fourCallsReturnsZeroThroughThree() {
        // Act
        int actual1 = sut.getNumber();
        int actual2 = sut.getNumber();
        int actual3 = sut.getNumber();
        int actual4 = sut.getNumber();

        // Assert
        assertEquals(0, actual1);
        assertEquals(1, actual2);
        assertEquals(2, actual3);
        assertEquals(3, actual4);
    }
}
