package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {
    private static final int INITIAL_POSITION = 0;


    private List<Integer> circularList = new LinkedList();
    private int position = INITIAL_POSITION;
    private boolean next = false;
    private boolean previous = false;

    @Override
    public void add(int element) {
        circularList.add(element);
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
            if(previous){
                position--;
                previous = false;
            }
            next = true;
            int element = circularList.get(position++);
            if(position == circularList.size()){
                reset();
            }
            return Optional.of(element);
        }
    }

    @Override
    public Optional<Integer> previous() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            if(position == size()){
                this.reset();
            }
            if(next){
                position--;
                next = false;
            }
            previous = true;
            int element = circularList.get(size() - ++position);
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
}
