package com.example.springbootcloud.repository;


import com.example.springbootcloud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
