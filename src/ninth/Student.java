package ninth;

public class Student  implements Comparable<Student>{

    public int idNumber;
    public String name;
    public String surname;
    public int mark;

    public Student(int idNumber, String name, String surname, int mark) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.idNumber, student.idNumber);
    }



    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mark=" + mark +
                '}';
    }
}
