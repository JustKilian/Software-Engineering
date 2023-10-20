import java.util.Date;
public class Student {
    String firstname;
    String lastname;
    long studentId;
    double weight;
    Date birthday;

    public enum SortKey {
        FIRSTNAME,
        LASTNAME,
        STUDENTID,
        WEIGHT,
        BIRTHDAY
    }

    Student() {
        Student student = new Student(null, null, studentId, 0, new Date());
    }

    Student(String firstname, String lastname, long studentId, double weight, Date birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.weight = weight;
        this.birthday = birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public long getStudentId() {
        return studentId;
    }

    public double getWeight() {
        return weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname +
                ", lastname='" + lastname +
                ", studentId=" + studentId +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }
}
