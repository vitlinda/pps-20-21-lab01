package lab01.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {
    private final CircularListImpl circularList = new CircularListImpl();

    @Test
    public void initialListSize(){
        assertEquals(0, circularList.size());
    }

    @Test
    public void listSizeAfterAdd(){
        circularList.add(1);
        assertEquals(1, circularList.size());
    }

}
