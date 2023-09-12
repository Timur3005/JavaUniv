package tenth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SortingStudentsByGPATenth implements Comparator<StudentTenth> {

    private List<StudentTenth> students;
    private final Comparator<StudentTenth> comparator;

    public SortingStudentsByGPATenth(List<StudentTenth> students, Comparator<StudentTenth> comparator) {
        this.students = students;
        this.comparator = comparator;
    }

    public void setArray(List<StudentTenth> students) {
        this.students = students;
    }

    public void quickSort() {
        students.sort(comparator);
    }

    public void outArray() {
        for (StudentTenth student : students) {
            System.out.println(student);
        }
    }

    public void mergeSort() {
        List<StudentTenth> temp = new ArrayList<>(students);
        mergeSort(0, students.size() - 1, temp, comparator);
    }

    private void mergeSort(int left, int right, List<StudentTenth> temp, Comparator<StudentTenth> comparator) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid, temp, comparator);
            mergeSort(mid + 1, right, temp, comparator);
            merge(left, mid, right, temp, comparator);
        }
    }

    private void merge(int left, int mid, int right, List<StudentTenth> temp, Comparator<StudentTenth> comparator) {
        int rightStart = mid + 1;
        int index = left;
        int size = right - left + 1;

        while (left <= mid && rightStart <= right) {
            if (comparator.compare(students.get(left), students.get(rightStart)) >= 0) {
                temp.set(index, students.get(left));
                left++;
            } else {
                temp.set(index, students.get(rightStart));
                rightStart++;
            }
            index++;
        }

        while (left <= mid) {
            temp.set(index, students.get(left));
            left++;
            index++;
        }

        while (rightStart <= right) {
            temp.set(index, students.get(rightStart));
            rightStart++;
            index++;
        }

        for (int i = 0; i < size; i++, right--) {
            students.set(right, temp.get(right));
        }
    }

    @Override
    public int compare(StudentTenth o1, StudentTenth o2) {
        return Double.compare(o2.getGpa(), o2.getGpa());
    }

    @Override
    public Comparator<StudentTenth> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<StudentTenth> thenComparing(Comparator<? super StudentTenth> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<StudentTenth> thenComparing(Function<? super StudentTenth, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<StudentTenth> thenComparing(Function<? super StudentTenth, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<StudentTenth> thenComparingInt(ToIntFunction<? super StudentTenth> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<StudentTenth> thenComparingLong(ToLongFunction<? super StudentTenth> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<StudentTenth> thenComparingDouble(ToDoubleFunction<? super StudentTenth> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
