package lab01.tdd.strategy;

public class EqualsStrategy extends SelectStrategy {

    private final int number;

    public EqualsStrategy(final int number){
        this.number = number;
    }

    @Override
    public boolean apply(int element) {
        return element == number;
    }
}
