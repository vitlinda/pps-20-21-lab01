package lab01.tdd;

import lab01.tdd.strategy.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextWithStrategyTest {
    private CircularListImpl circularList;
    private StrategyAbstractFactory factory;

    @BeforeEach
    void beforeEach() {
        factory = new StrategyFactory();
        circularList = new CircularListImpl();
        addMultipleElements();
    }

    @Test
    void nextEvenElementWithEvenStrategy() {
        SelectStrategy strategy = factory.createEvenStrategy();
        assertEquals(Optional.of(0), circularList.next(strategy));
        assertEquals(Optional.of(2), circularList.next(strategy));
    }

    @Test
    void nextEvenElementWithMultipleOfStrategy() {
        SelectStrategy strategy = factory.createMultipleOfStrategy(5);
        assertEquals(Optional.of(0), circularList.next(strategy));
        assertEquals(Optional.of(5), circularList.next(strategy));
    }

    @Test
    void nextEvenElementWithEqualsStrategy() {
        SelectStrategy strategy = factory.createEqualsStrategy(3);
        assertEquals(Optional.of(3), circularList.next(strategy));
    }

    private void addMultipleElements() {
        circularList.add(0);
        circularList.add(2);
        circularList.add(3);
        circularList.add(5);
    }

}
