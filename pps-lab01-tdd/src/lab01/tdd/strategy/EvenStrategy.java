package lab01.tdd.strategy;

public class EvenStrategy extends SelectStrategy{
    @Override
    public boolean apply(int element) {
        return element % 2 == 0;
    }
}
