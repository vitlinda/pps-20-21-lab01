package lab01.tdd.strategy;

public class MultipleOfStrategy extends SelectStrategy {
    private final int number;

    public MultipleOfStrategy(final int number){
        this.number = number;
    }

    @Override
    public boolean apply(int element) {
        return element % number == 0;
    }
}
