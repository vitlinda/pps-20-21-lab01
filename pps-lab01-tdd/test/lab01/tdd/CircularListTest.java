package lab01.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {
    private CircularListImpl circularList;

    @BeforeEach
    void beforeEach(){
        this.circularList = new CircularListImpl();
    }

    @Test
    public void initialListSize(){
        assertEquals(0, circularList.size());
    }

    @Test
    public void listSizeAfterAdd(){
        circularList.add(1);
        assertEquals(1, circularList.size());
    }

    @Test
    public void listIsEmptyBeforeAnyAdd(){
        assertTrue(circularList.isEmpty());
    }

    @Test
    public void listIsEmptyAfterAdd(){
        circularList.add(1);
        assertFalse(circularList.isEmpty());
    }

    @Test
    public void listNextWithNoElement() {
        assertEquals(Optional.empty(), circularList.next());
    }


}
