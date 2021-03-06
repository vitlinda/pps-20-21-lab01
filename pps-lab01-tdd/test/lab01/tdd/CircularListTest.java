package lab01.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {
    private static final int OCCURENCIES_NUMBER = 3;

    private CircularListImpl circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListImpl();
    }

    @Test
    public void initialListSize() {
        assertEquals(0, circularList.size());
    }

    @Test
    public void listSizeAfterAdd() {
        circularList.add(1);
        assertEquals(1, circularList.size());
    }

    @Test
    public void listIsEmptyBeforeAnyAdd() {
        assertTrue(circularList.isEmpty());
    }

    @Test
    public void listIsEmptyAfterAdd() {
        circularList.add(1);
        assertFalse(circularList.isEmpty());
    }

    @Test
    public void nextElementWithEmptyList() {
        assertEquals(Optional.empty(), circularList.next());
    }

    @Test
    public void nextElementAfterOneAdd() {
        circularList.add(1);
        assertEquals(Optional.of(1), circularList.next());
    }

    @Test
    public void nextElementAfterMultipleAdds() {
        for (int i = 0; i < OCCURENCIES_NUMBER; i++) {
            circularList.add(i);
        }
        for (int i = 0; i < OCCURENCIES_NUMBER; i++) {
            assertEquals(Optional.of(i), circularList.next());
        }
    }

    @Test
    public void nextElementAfterLastElementIsTheFirstElementOfTheList() {
        nextElementAfterMultipleAdds();
        assertEquals(Optional.of(0), circularList.next());
    }

    @Test
    public void previousElementWithEmptyList() {
        assertEquals(Optional.empty(), circularList.next());
    }

    @Test
    public void previousElementAfterOneAdd() {
        circularList.add(1);
        assertEquals(Optional.of(1), circularList.previous());
    }


}
