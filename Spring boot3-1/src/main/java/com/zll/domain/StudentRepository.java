package com.zll.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByName(String name);

    Student findByNameAndAge(String name, Integer age);

    @Query("from Student s where s.name=:name")
    Student findStudent(@Param("name") String name);


}
