package ninth.fourth;

import ninth.first_and_second.Student;

public class ComparableImpl implements Comparable<ComparableImpl>{

    private int strong = 0;

    public ComparableImpl(int strong) {
        this.strong = strong;
    }

    @Override
    public int compareTo(ComparableImpl o) {
        return this.strong - o.strong;
    }

}
