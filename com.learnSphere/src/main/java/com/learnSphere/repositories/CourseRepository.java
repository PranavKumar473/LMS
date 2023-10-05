package com.learnSphere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	Course findByCourseId(int courseId);
}
