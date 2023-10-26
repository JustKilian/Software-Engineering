import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void add() {
        StudentList studentList = new StudentList();
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        assertTrue(studentList.add(student));
        assertFalse(studentList.add(student));
    }

    @Test
    void remove() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1234567, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 12345678, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student3);
        assertTrue(studentList.remove(student1));
        assertFalse(studentList.remove(student2));
    }

    @Test
    void removeIndex() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1234567, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 12345678, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        assertEquals(student1, studentList.remove(0));
        assertNull(studentList.remove(-1));
        assertNull(studentList.remove(3));
    }

    @Test
    void get() {
        StudentList studentList = new StudentList();
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student);
        assertEquals(student, studentList.get(0));
        assertNull(studentList.get(-1));
        assertNull(studentList.get(1));
    }

    @Test
    void findLastName() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1234567, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 12345678, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        assertEquals(3, studentList.findLastName("lastname").size());
    }

    @Test
    void findFirstName() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1234567, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 12345678, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        assertEquals(3, studentList.findFirstName("firstname").size());
    }

    @Test
    void findStudentsByAge() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1234567, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 12345678, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        assertEquals(3, studentList.findStudentsByAge(23).size());
    }

    @Test
    void size() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1234567, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 12345678, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 123456789, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        assertEquals(3, studentList.size());
    }

    @Test
    void constructor() {
        StudentList studentList = new StudentList();
        assertEquals(0, studentList.size());
    }

    @Test
    void copyConstructor() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("firstname", "lastname", 1, 80.0, new Date(2000, 5, 5));
        Student student2 = new Student("firstname", "lastname", 2, 80.0, new Date(2000, 5, 5));
        Student student3 = new Student("firstname", "lastname", 3, 80.0, new Date(2000, 5, 5));
        Student student4 = new Student("firstname", "lastname", 4, 80.0, new Date(2000, 5, 5));
        Student student5 = new Student("firstname", "lastname", 5, 80.0, new Date(2000, 5, 5));
        Student student6 = new Student("firstname", "lastname", 6, 80.0, new Date(2000, 5, 5));
        Student student7 = new Student("firstname", "lastname", 7, 80.0, new Date(2000, 5, 5));
        Student student8 = new Student("firstname", "lastname", 8, 80.0, new Date(2000, 5, 5));
        Student student9 = new Student("firstname", "lastname", 9, 80.0, new Date(2000, 5, 5));
        Student student10 = new Student("firstname", "lastname", 10, 80.0, new Date(2000, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        StudentList studentListCopy = new StudentList(studentList);
        studentListCopy.remove(0);
        assertEquals(9, studentListCopy.size());
        assertEquals(10, studentList.size());
    }

    @Test
    void sort() {
        StudentList studentList = new StudentList();
        Student student1 = new Student("A", "J", 6, 81.0, new Date(2000, 5, 5));
        Student student2 = new Student("B", "I", 7, 82.0, new Date(2002, 5, 5));
        Student student3 = new Student("C", "H", 8, 83.0, new Date(1996, 5, 5));
        Student student4 = new Student("D", "G", 9, 84.0, new Date(1972, 5, 5));
        Student student5 = new Student("E", "F", 10, 85.0, new Date(1964, 5, 5));
        Student student6 = new Student("F", "E", 1, 86.0, new Date(2008, 5, 5));
        Student student7 = new Student("G", "D", 2, 87.0, new Date(2010, 5, 5));
        Student student8 = new Student("H", "C", 3, 88.0, new Date(2012, 5, 5));
        Student student9 = new Student("I", "B", 4, 89.0, new Date(2015, 5, 5));
        Student student10 = new Student("J", "A", 5, 90.0, new Date(2005, 5, 5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.sort(Student.SortKey.FIRSTNAME);
        assertEquals(student1, studentList.get(0));
        assertEquals(student2, studentList.get(1));
        assertEquals(student3, studentList.get(2));
        assertEquals(student4, studentList.get(3));
        assertEquals(student5, studentList.get(4));
        assertEquals(student6, studentList.get(5));
        assertEquals(student7, studentList.get(6));
        assertEquals(student8, studentList.get(7));
        assertEquals(student9, studentList.get(8));
        assertEquals(student10, studentList.get(9));
        studentList.sort(Student.SortKey.LASTNAME);
        assertEquals(student10, studentList.get(0));
        assertEquals(student9, studentList.get(1));
        assertEquals(student8, studentList.get(2));
        assertEquals(student7, studentList.get(3));
        assertEquals(student6, studentList.get(4));
        assertEquals(student5, studentList.get(5));
        assertEquals(student4, studentList.get(6));
        assertEquals(student3, studentList.get(7));
        assertEquals(student2, studentList.get(8));
        assertEquals(student1, studentList.get(9));
        studentList.sort(Student.SortKey.STUDENTID);
        assertEquals(student6, studentList.get(0));
        assertEquals(student7, studentList.get(1));
        assertEquals(student8, studentList.get(2));
        assertEquals(student9, studentList.get(3));
        assertEquals(student10, studentList.get(4));
        assertEquals(student1, studentList.get(5));
        assertEquals(student2, studentList.get(6));
        assertEquals(student3, studentList.get(7));
        assertEquals(student4, studentList.get(8));
        assertEquals(student5, studentList.get(9));
        studentList.sort(Student.SortKey.WEIGHT);
        assertEquals(student1, studentList.get(0));
        assertEquals(student2, studentList.get(1));
        assertEquals(student3, studentList.get(2));
        assertEquals(student4, studentList.get(3));
        assertEquals(student5, studentList.get(4));
        assertEquals(student6, studentList.get(5));
        assertEquals(student7, studentList.get(6));
        assertEquals(student8, studentList.get(7));
        assertEquals(student9, studentList.get(8));
        assertEquals(student10, studentList.get(9));
        studentList.sort(Student.SortKey.BIRTHDAY);
        assertEquals(student5, studentList.get(0));
        assertEquals(student4, studentList.get(1));
        assertEquals(student3, studentList.get(2));
        assertEquals(student1, studentList.get(3));
        assertEquals(student2, studentList.get(4));
        assertEquals(student10, studentList.get(5));
        assertEquals(student6, studentList.get(6));
        assertEquals(student7, studentList.get(7));
        assertEquals(student8, studentList.get(8));
        assertEquals(student9, studentList.get(9));
    }
}