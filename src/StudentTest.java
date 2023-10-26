import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getFirstname() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals("firstname", student.getFirstname());
    }

    @Test
    void setFirstname() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        student.setFirstname("firstname2");
        assertEquals("firstname2", student.getFirstname());
    }

    @Test
    void getLastname() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals("lastname", student.getLastname());
    }

    @Test
    void setLastname() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        student.setLastname("lastname2");
        assertEquals("lastname2", student.getLastname());
    }

    @Test
    void getStudentId() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals(123456789, student.getStudentId());
    }

    // TODO: Test setStudentId()
    // setStudentId() is private, so it cannot be tested directly.

    @Test
    void getWeight() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals(80.0, student.getWeight(), 0.0001);
    }

    @Test
    void setWeight() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        student.setWeight(80.1);
        assertEquals(80.1, student.getWeight(), 0.0001);
    }

    @Test
    void getBirthday() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals(new Date(1989, 11, 11), student.getBirthday());
    }

    @Test
    void setBirthday() {
        Date birthday = new Date(1989, 11, 11);
        Student student = new Student("firstname", "lastname", 123456789, 80.0, birthday);
        student.setBirthday(new Date(2001, 5, 5));
        assertEquals(new Date(2001, 5, 5), student.getBirthday());
    }

    @Test
    void getName() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals("firstname lastname", student.getName());
    }

    @Test
    void constructor() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals("firstname", student.getFirstname());
        assertEquals("lastname", student.getLastname());
        assertEquals(123456789, student.getStudentId());
        assertEquals(80.0, student.getWeight(), 0.0001);
        assertEquals(new Date(1989, 11, 11), student.getBirthday());
    }

    @Test
    void constructorEmpty() {
        Student student = new Student();
        assertNull(student.getFirstname());
        assertNull(student.getLastname());
        assertEquals(0, student.getStudentId());
        assertEquals(0, student.getWeight(), 0.0001);
        assertEquals(new Date(0), student.getBirthday());
        // TODO: Get the Date working.
    }

    @Test
    void toStringTest() {
        Student student = new Student("firstname", "lastname", 123456789, 80.0, new Date(1989, 11, 11));
        assertEquals("Student{firstname='firstname, lastname='lastname, studentId=123456789, weight=80.0, birthday=Wed Dec 11 00:00:00 CET 3889}", student.toString());
    }
}