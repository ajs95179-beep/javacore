package dao;

import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentDAOImpl implements StudentDAO {

    private List<Student> studentList = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
}
