package com.example.projetweb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    //@Query(value="SELECT * FROM STUDENT", nativeQuery = true)
    //List<Student> findAllStudent();

}


