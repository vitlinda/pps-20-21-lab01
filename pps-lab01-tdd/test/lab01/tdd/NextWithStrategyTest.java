package lab01.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextWithStrategyTest {
    private CircularListImpl circularList;
    private SelectStrategy strategy;

    @BeforeEach
    void beforeEach() {
        circularList = new CircularListImpl();
        addMultipleElements();
    }

    @Test
    void nextEvenElementWithEvenStrategy() {
        strategy = new EvenStrategy();
        assertEquals(Optional.of(0), circularList.next(strategy));
        assertEquals(Optional.of(2), circularList.next(strategy));

    }

    @Test
    void nextEvenElementWithMultipleOfStrategy() {
        strategy = new MultipleOfStrategy(5);
        assertEquals(Optional.of(0), circularList.next(strategy));
        assertEquals(Optional.of(5), circularList.next(strategy));
    }

    @Test
    void nextEvenElementWithEqualsStrategy() {
        strategy = new MultipleOfStrategy(5);
        assertEquals(Optional.of(0), circularList.next(strategy));
        assertEquals(Optional.of(5), circularList.next(strategy));
    }

    private void addMultipleElements() {
        circularList.add(0);
        circularList.add(2);
        circularList.add(3);
        circularList.add(5);
    }

}
