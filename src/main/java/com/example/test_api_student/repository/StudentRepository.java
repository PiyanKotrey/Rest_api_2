package com.example.test_api_student.repository;

import com.example.test_api_student.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentRepository {

    @Select("""
            SELECT *FROM student
            """)
    List<Student> getAll();
}
