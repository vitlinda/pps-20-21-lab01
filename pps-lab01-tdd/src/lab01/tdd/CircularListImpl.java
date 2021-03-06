package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {
    private static final int INITIAL_POSITION = 0;


    private List<Integer> circularList = new LinkedList();
    private int position = INITIAL_POSITION;

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
        if (this.isEmpty()) {
            return Optional.empty();
        } else {
            int element = circularList.get(position++);
            if(position == circularList.size()){
                this.reset();
            }
            return Optional.of(element);
        }
    }

    @Override
    public Optional<Integer> previous() {
        if (this.isEmpty()) {
            return Optional.empty();
        } else {
            if(position == this.size()){
                this.reset();
            }
            int element = circularList.get(this.size() - ++position);
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
