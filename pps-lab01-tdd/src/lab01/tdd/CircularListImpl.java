package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {
    private static final int INITIAL_POSITION = 0;

    private List<Integer> circularList = new LinkedList();
    private int position = INITIAL_POSITION;
    private int nextElement;
    private int previousElement;

    @Override
    public void add(int element) {
        circularList.add(element);
        nextElement = circularList.get(0);
        previousElement = circularList.get(size()-1);
    }

    @Override
    public int size() {
        return circularList.size();
    }

    @Override
    public boolean isEmpty() {
        return circularList.isEmpty();
    }

    @Override
    public Optional<Integer> next() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            int element = nextElement;
            position = circularList.indexOf(element);
            setPreviousElement(position);
            if (position + 1 == circularList.size()) {
                reset();
                nextElement = circularList.get(position);
            } else {
                nextElement = circularList.get(position + 1);
            }

            return Optional.of(element);
        }
    }

    @Override
    public Optional<Integer> previous() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            int element = previousElement;
            position = circularList.indexOf(previousElement);
            if (position == 0) {
                previousElement = circularList.get(size() - 1);
            } else {
                previousElement = circularList.get(position - 1);
            }
            setNextElement(position);
            return Optional.of(element);
        }
    }

    @Override
    public void reset() {
        position = INITIAL_POSITION;
    }

    @Override
    public Optional<Integer> next(SelectStrategy strategy) {
        return Optional.empty();
    }

    private void setNextElement (int currentPosition) {
        if(currentPosition == size() - 1){
            nextElement = INITIAL_POSITION;
        } else {
            nextElement += currentPosition + 1;
        }
    }

    private void setPreviousElement(int currentPosition) {
        if(currentPosition - 1 < 0){
            previousElement= size() - 1;
        } else {
            previousElement = currentPosition - 1;
        }
    }

}
