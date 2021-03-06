package lab01.tdd.strategy;

public abstract class StrategyAbstractFactory {
    public abstract SelectStrategy createEvenStrategy();
    public abstract SelectStrategy createMultipleOfStrategy(int number);
    public abstract SelectStrategy createEqualsStrategy(int number);

}
