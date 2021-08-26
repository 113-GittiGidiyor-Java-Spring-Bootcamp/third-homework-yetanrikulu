package com.example.thirdhomeworkyetanrikulu.repository;

import com.example.thirdhomeworkyetanrikulu.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {

    List<Course> findByCourseNameContains (String name);

    void deleteByCourseName(String name);

}
