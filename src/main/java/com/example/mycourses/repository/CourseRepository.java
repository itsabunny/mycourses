package com.example.mycourses.repository;

import com.example.mycourses.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByUserEmail(String userEmail);
}
