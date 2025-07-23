package com.example.mycourses.controller;

import com.example.mycourses.model.Course;
import com.example.mycourses.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    // Hämta alla kurser
    @GetMapping
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    // Lägg till ny kurs
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}
