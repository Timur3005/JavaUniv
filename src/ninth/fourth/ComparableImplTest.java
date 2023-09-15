package ninth.fourth;

public class ComparableImplTest {

    public static void main(String[] args) {
        ComparableImpl comparable = new ComparableImpl(300);
        ComparableImpl comparable1 = new ComparableImpl(4);
        System.out.println(comparable.compareTo(comparable1));
    }

}
