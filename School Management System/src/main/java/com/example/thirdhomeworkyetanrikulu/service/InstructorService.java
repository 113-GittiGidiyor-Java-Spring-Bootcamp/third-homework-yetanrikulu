package com.example.thirdhomeworkyetanrikulu.service;

import com.example.thirdhomeworkyetanrikulu.entity.Course;
import com.example.thirdhomeworkyetanrikulu.entity.Instructor;
import com.example.thirdhomeworkyetanrikulu.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorRepository instructorRepository;


    public List<Instructor> findAll() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorRepository.findAll().forEach(instructorList::add);
        return instructorList;
    }

    public Instructor findById(int id) {
        return instructorRepository.findById(id).get();
    }

    public Instructor save(Instructor instructor) {
        return (Instructor) instructorRepository.save(instructor);
    }

    public Instructor update(Instructor instructor) {
        return save(instructor);
    }

    public void deleteById(int id) {
        instructorRepository.deleteById(id);
    }

    public void deleteByObject(Instructor instructor) {
        int id = instructor.getId();
        deleteById(id);
    }
}

