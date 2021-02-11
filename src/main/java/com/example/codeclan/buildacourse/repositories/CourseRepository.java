package com.example.codeclan.buildacourse.repositories;

import com.example.codeclan.buildacourse.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
