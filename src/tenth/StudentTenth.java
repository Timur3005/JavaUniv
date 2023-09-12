package tenth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentTenth {

    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa;
    private Date birthDay;
    private SimpleDateFormat simpleDateFormat;

    @Override
    public String toString() {
        return "StudentTenth{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                ", birthDay=" + birthDay;
    }

    public StudentTenth(String firstName, String lastName, String specialty, int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public StudentTenth(String firstName, String lastName, String specialty, int course, String group, double gpa, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.birthDay = birthDay;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setDateFormat(String format){
        simpleDateFormat = new SimpleDateFormat(format);
    }

    public void setBirthDay(String date) {
        try {
            this.birthDay = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
