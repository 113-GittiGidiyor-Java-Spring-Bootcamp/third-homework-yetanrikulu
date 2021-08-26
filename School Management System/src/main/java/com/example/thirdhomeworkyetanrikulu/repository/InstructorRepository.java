package com.example.thirdhomeworkyetanrikulu.repository;

import com.example.thirdhomeworkyetanrikulu.entity.Course;
import com.example.thirdhomeworkyetanrikulu.entity.Instructor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstructorRepository extends CrudRepository<Instructor,Integer> {

    List<Instructor> findByNameContains(String name);

    void deleteByName(String name);

}
