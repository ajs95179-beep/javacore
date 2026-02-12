package dao;


import java.util.List;
import model.Student;

public interface StudentDAO {

    void addStudent(Student student);

    List<Student> getAllStudents();
}

