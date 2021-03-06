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
    }

    @Test
    void nextEvenElementWithEvenStrategy() {
        strategy = new EvenStrategy();
        circularList.add(1);
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);

        assertEquals(Optional.of(2), circularList.next(strategy));
        assertEquals(Optional.of(4), circularList.next(strategy));

    }

}
