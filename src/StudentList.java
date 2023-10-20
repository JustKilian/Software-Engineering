import java.util.ArrayList;

public class StudentList {
    private Student[] students;

    StudentList() {
        students = new Student[0];
    }

    StudentList(StudentList studentList) {
        this.students = studentList.students;
    }

    public boolean add(Student student) {
        if (this.containsID(student.getStudentId())) {
            return false;
        } else {
            Student[] newStudents = new Student[students.length + 1];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            newStudents[students.length] = student;
            students = newStudents;
            return true;
        }
    }

    public boolean remove(Student student) {
        if (this.containsID(student.getStudentId())) {
            Student[] newStudents = new Student[students.length - 1];
            int i = 0;
            for (Student s2 : students) {
                if (s2.getStudentId() != student.getStudentId()) {
                    newStudents[i] = s2;
                    i++;
                }
            }
            students = newStudents;
            return true;
        } else {
            return false;
        }
    }

    public Student remove(int index) {
        if (index < 0 || index >= students.length) {
            return null;
        }
        Student student = students[index];
        Student[] newStudents = new Student[students.length - 1];
        int i = 0;
        for (Student s : students) {
            if (s.getStudentId() != student.getStudentId()) {
                newStudents[i] = s;
                i++;
            }
        }
        students = newStudents;
        return student;
    }

    public Student get(int index) {
        if (index < 0 || index >= students.length) {
            return null;
        }
        return students[index];
    }

    public ArrayList<Integer> findLastName(String lastname) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getLastname().equals(lastname)) {
                indices.add(i);
            }
        }
        return indices;
    }

    public ArrayList<Integer> findFirstName(String firstname) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstname().equals(firstname)) {
                indices.add(i);
            }
        }
        return indices;
    }

    public ArrayList<Integer> findStudentsByAge(int age) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for (int i = 0; i < students.length; i++) {
            int studentAge = AgeCalculator.calculateAge(students[i].getBirthday());
            if (studentAge == age) {
                indices.add(i);
            }
        }
        return indices;
    }

    public int size() {
        return students.length;
    }

    private boolean containsID(final long studentId) {
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }

    public boolean sort(Student.SortKey key) {
        int low = 0;
        int high = students.length - 1;

        return switch (key) {
            case FIRSTNAME -> {
                QuickSort.quickSort(students, low, high, Student.SortKey.FIRSTNAME);
                yield true;
            }
            case LASTNAME -> {
                QuickSort.quickSort(students, low, high, Student.SortKey.LASTNAME);
                yield true;
            }
            case STUDENTID -> {
                QuickSort.quickSort(students, low, high, Student.SortKey.STUDENTID);
                yield true;
            }
            case WEIGHT -> {
                QuickSort.quickSort(students, low, high, Student.SortKey.WEIGHT);
                yield true;
            }
            case BIRTHDAY -> {
                QuickSort.quickSort(students, low, high, Student.SortKey.BIRTHDAY);
                yield true;
            }
            default -> false;
        };
    }
}
