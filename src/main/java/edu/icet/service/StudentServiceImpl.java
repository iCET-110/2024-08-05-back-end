package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class StudentServiceImpl implements StudentService{
    List<Student> studentList=new ArrayList<>();
    @Override
    public List<Student> getData() {
        return studentList;
    }
    @Override
    public void addData(Student student) {
        studentList.add(
                new Student(1,"saman","gampaha",230)
        );
        studentList.add(student);
    }
}
